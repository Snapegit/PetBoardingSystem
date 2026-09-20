package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuyuejiyangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuyuejiyangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuyuejiyangView;


/**
 * 预约寄养
 *
 * @author 
 * @email 
 * @date 2024-04-07 21:40:09
 */
public interface YuyuejiyangService extends IService<YuyuejiyangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuyuejiyangVO> selectListVO(Wrapper<YuyuejiyangEntity> wrapper);
   	
   	YuyuejiyangVO selectVO(@Param("ew") Wrapper<YuyuejiyangEntity> wrapper);
   	
   	List<YuyuejiyangView> selectListView(Wrapper<YuyuejiyangEntity> wrapper);
   	
   	YuyuejiyangView selectView(@Param("ew") Wrapper<YuyuejiyangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuyuejiyangEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<YuyuejiyangEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<YuyuejiyangEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<YuyuejiyangEntity> wrapper);



}

