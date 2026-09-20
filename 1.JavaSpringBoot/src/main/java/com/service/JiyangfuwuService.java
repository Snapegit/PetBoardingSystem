package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiyangfuwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiyangfuwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiyangfuwuView;


/**
 * 寄养服务
 *
 * @author 
 * @email 
 * @date 2024-04-07 21:40:09
 */
public interface JiyangfuwuService extends IService<JiyangfuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiyangfuwuVO> selectListVO(Wrapper<JiyangfuwuEntity> wrapper);
   	
   	JiyangfuwuVO selectVO(@Param("ew") Wrapper<JiyangfuwuEntity> wrapper);
   	
   	List<JiyangfuwuView> selectListView(Wrapper<JiyangfuwuEntity> wrapper);
   	
   	JiyangfuwuView selectView(@Param("ew") Wrapper<JiyangfuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiyangfuwuEntity> wrapper);

   	

}

