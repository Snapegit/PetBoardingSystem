package com.dao;

import com.entity.ChongwuhuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChongwuhuodongVO;
import com.entity.view.ChongwuhuodongView;


/**
 * 宠物活动
 * 
 * @author 
 * @email 
 * @date 2024-04-07 21:40:10
 */
public interface ChongwuhuodongDao extends BaseMapper<ChongwuhuodongEntity> {
	
	List<ChongwuhuodongVO> selectListVO(@Param("ew") Wrapper<ChongwuhuodongEntity> wrapper);
	
	ChongwuhuodongVO selectVO(@Param("ew") Wrapper<ChongwuhuodongEntity> wrapper);
	
	List<ChongwuhuodongView> selectListView(@Param("ew") Wrapper<ChongwuhuodongEntity> wrapper);

	List<ChongwuhuodongView> selectListView(Pagination page,@Param("ew") Wrapper<ChongwuhuodongEntity> wrapper);

	
	ChongwuhuodongView selectView(@Param("ew") Wrapper<ChongwuhuodongEntity> wrapper);
	

}
