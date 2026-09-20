package com.dao;

import com.entity.JiyangrizhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiyangrizhiVO;
import com.entity.view.JiyangrizhiView;


/**
 * 寄养日志
 * 
 * @author 
 * @email 
 * @date 2024-04-07 21:40:09
 */
public interface JiyangrizhiDao extends BaseMapper<JiyangrizhiEntity> {
	
	List<JiyangrizhiVO> selectListVO(@Param("ew") Wrapper<JiyangrizhiEntity> wrapper);
	
	JiyangrizhiVO selectVO(@Param("ew") Wrapper<JiyangrizhiEntity> wrapper);
	
	List<JiyangrizhiView> selectListView(@Param("ew") Wrapper<JiyangrizhiEntity> wrapper);

	List<JiyangrizhiView> selectListView(Pagination page,@Param("ew") Wrapper<JiyangrizhiEntity> wrapper);

	
	JiyangrizhiView selectView(@Param("ew") Wrapper<JiyangrizhiEntity> wrapper);
	

}
