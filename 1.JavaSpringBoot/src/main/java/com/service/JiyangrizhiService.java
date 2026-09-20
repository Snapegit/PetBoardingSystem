package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiyangrizhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiyangrizhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiyangrizhiView;


/**
 * 寄养日志
 *
 * @author 
 * @email 
 * @date 2024-04-07 21:40:09
 */
public interface JiyangrizhiService extends IService<JiyangrizhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiyangrizhiVO> selectListVO(Wrapper<JiyangrizhiEntity> wrapper);
   	
   	JiyangrizhiVO selectVO(@Param("ew") Wrapper<JiyangrizhiEntity> wrapper);
   	
   	List<JiyangrizhiView> selectListView(Wrapper<JiyangrizhiEntity> wrapper);
   	
   	JiyangrizhiView selectView(@Param("ew") Wrapper<JiyangrizhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiyangrizhiEntity> wrapper);

   	

}

