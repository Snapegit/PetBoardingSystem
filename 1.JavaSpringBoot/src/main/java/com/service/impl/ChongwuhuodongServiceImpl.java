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


import com.dao.ChongwuhuodongDao;
import com.entity.ChongwuhuodongEntity;
import com.service.ChongwuhuodongService;
import com.entity.vo.ChongwuhuodongVO;
import com.entity.view.ChongwuhuodongView;

@Service("chongwuhuodongService")
public class ChongwuhuodongServiceImpl extends ServiceImpl<ChongwuhuodongDao, ChongwuhuodongEntity> implements ChongwuhuodongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongwuhuodongEntity> page = this.selectPage(
                new Query<ChongwuhuodongEntity>(params).getPage(),
                new EntityWrapper<ChongwuhuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongwuhuodongEntity> wrapper) {
		  Page<ChongwuhuodongView> page =new Query<ChongwuhuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ChongwuhuodongVO> selectListVO(Wrapper<ChongwuhuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongwuhuodongVO selectVO(Wrapper<ChongwuhuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongwuhuodongView> selectListView(Wrapper<ChongwuhuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongwuhuodongView selectView(Wrapper<ChongwuhuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
