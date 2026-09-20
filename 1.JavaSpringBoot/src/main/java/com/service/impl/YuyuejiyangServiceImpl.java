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


import com.dao.YuyuejiyangDao;
import com.entity.YuyuejiyangEntity;
import com.service.YuyuejiyangService;
import com.entity.vo.YuyuejiyangVO;
import com.entity.view.YuyuejiyangView;

@Service("yuyuejiyangService")
public class YuyuejiyangServiceImpl extends ServiceImpl<YuyuejiyangDao, YuyuejiyangEntity> implements YuyuejiyangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuyuejiyangEntity> page = this.selectPage(
                new Query<YuyuejiyangEntity>(params).getPage(),
                new EntityWrapper<YuyuejiyangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuyuejiyangEntity> wrapper) {
		  Page<YuyuejiyangView> page =new Query<YuyuejiyangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YuyuejiyangVO> selectListVO(Wrapper<YuyuejiyangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuyuejiyangVO selectVO(Wrapper<YuyuejiyangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuyuejiyangView> selectListView(Wrapper<YuyuejiyangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuyuejiyangView selectView(Wrapper<YuyuejiyangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<YuyuejiyangEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<YuyuejiyangEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<YuyuejiyangEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
