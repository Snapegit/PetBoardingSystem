package com.dao;

import com.entity.ChongwusiliaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChongwusiliaoVO;
import com.entity.view.ChongwusiliaoView;


/**
 * 宠物饲料
 * 
 * @author 
 * @email 
 * @date 2024-04-07 21:40:10
 */
public interface ChongwusiliaoDao extends BaseMapper<ChongwusiliaoEntity> {
	
	List<ChongwusiliaoVO> selectListVO(@Param("ew") Wrapper<ChongwusiliaoEntity> wrapper);
	
	ChongwusiliaoVO selectVO(@Param("ew") Wrapper<ChongwusiliaoEntity> wrapper);
	
	List<ChongwusiliaoView> selectListView(@Param("ew") Wrapper<ChongwusiliaoEntity> wrapper);

	List<ChongwusiliaoView> selectListView(Pagination page,@Param("ew") Wrapper<ChongwusiliaoEntity> wrapper);

	
	ChongwusiliaoView selectView(@Param("ew") Wrapper<ChongwusiliaoEntity> wrapper);
	

}
