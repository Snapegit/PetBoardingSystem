package com.dao;

import com.entity.JiyangfuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiyangfuwuVO;
import com.entity.view.JiyangfuwuView;


/**
 * 寄养服务
 * 
 * @author 
 * @email 
 * @date 2024-04-07 21:40:09
 */
public interface JiyangfuwuDao extends BaseMapper<JiyangfuwuEntity> {
	
	List<JiyangfuwuVO> selectListVO(@Param("ew") Wrapper<JiyangfuwuEntity> wrapper);
	
	JiyangfuwuVO selectVO(@Param("ew") Wrapper<JiyangfuwuEntity> wrapper);
	
	List<JiyangfuwuView> selectListView(@Param("ew") Wrapper<JiyangfuwuEntity> wrapper);

	List<JiyangfuwuView> selectListView(Pagination page,@Param("ew") Wrapper<JiyangfuwuEntity> wrapper);

	
	JiyangfuwuView selectView(@Param("ew") Wrapper<JiyangfuwuEntity> wrapper);
	

}
