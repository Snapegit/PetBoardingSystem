package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongwuhuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongwuhuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwuhuodongView;


/**
 * 宠物活动
 *
 * @author 
 * @email 
 * @date 2024-04-07 21:40:10
 */
public interface ChongwuhuodongService extends IService<ChongwuhuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongwuhuodongVO> selectListVO(Wrapper<ChongwuhuodongEntity> wrapper);
   	
   	ChongwuhuodongVO selectVO(@Param("ew") Wrapper<ChongwuhuodongEntity> wrapper);
   	
   	List<ChongwuhuodongView> selectListView(Wrapper<ChongwuhuodongEntity> wrapper);
   	
   	ChongwuhuodongView selectView(@Param("ew") Wrapper<ChongwuhuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongwuhuodongEntity> wrapper);

   	

}

