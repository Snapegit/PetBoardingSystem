package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChongwusiliaoDao;
import com.entity.ChongwusiliaoEntity;
import com.service.ChongwusiliaoService;
import com.entity.vo.ChongwusiliaoVO;
import com.entity.view.ChongwusiliaoView;

@Service("chongwusiliaoService")
public class ChongwusiliaoServiceImpl extends ServiceImpl<ChongwusiliaoDao, ChongwusiliaoEntity> implements ChongwusiliaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongwusiliaoEntity> page = this.selectPage(
                new Query<ChongwusiliaoEntity>(params).getPage(),
                new EntityWrapper<ChongwusiliaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongwusiliaoEntity> wrapper) {
		  Page<ChongwusiliaoView> page =new Query<ChongwusiliaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ChongwusiliaoVO> selectListVO(Wrapper<ChongwusiliaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongwusiliaoVO selectVO(Wrapper<ChongwusiliaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongwusiliaoView> selectListView(Wrapper<ChongwusiliaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongwusiliaoView selectView(Wrapper<ChongwusiliaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
