package com.dao;

import com.entity.YuyuejiyangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuyuejiyangVO;
import com.entity.view.YuyuejiyangView;


/**
 * 预约寄养
 * 
 * @author 
 * @email 
 * @date 2024-04-07 21:40:09
 */
public interface YuyuejiyangDao extends BaseMapper<YuyuejiyangEntity> {
	
	List<YuyuejiyangVO> selectListVO(@Param("ew") Wrapper<YuyuejiyangEntity> wrapper);
	
	YuyuejiyangVO selectVO(@Param("ew") Wrapper<YuyuejiyangEntity> wrapper);
	
	List<YuyuejiyangView> selectListView(@Param("ew") Wrapper<YuyuejiyangEntity> wrapper);

	List<YuyuejiyangView> selectListView(Pagination page,@Param("ew") Wrapper<YuyuejiyangEntity> wrapper);

	
	YuyuejiyangView selectView(@Param("ew") Wrapper<YuyuejiyangEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YuyuejiyangEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YuyuejiyangEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YuyuejiyangEntity> wrapper);



}
