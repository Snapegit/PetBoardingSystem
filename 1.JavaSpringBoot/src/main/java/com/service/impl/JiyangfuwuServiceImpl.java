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


import com.dao.JiyangfuwuDao;
import com.entity.JiyangfuwuEntity;
import com.service.JiyangfuwuService;
import com.entity.vo.JiyangfuwuVO;
import com.entity.view.JiyangfuwuView;

@Service("jiyangfuwuService")
public class JiyangfuwuServiceImpl extends ServiceImpl<JiyangfuwuDao, JiyangfuwuEntity> implements JiyangfuwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiyangfuwuEntity> page = this.selectPage(
                new Query<JiyangfuwuEntity>(params).getPage(),
                new EntityWrapper<JiyangfuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiyangfuwuEntity> wrapper) {
		  Page<JiyangfuwuView> page =new Query<JiyangfuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<JiyangfuwuVO> selectListVO(Wrapper<JiyangfuwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiyangfuwuVO selectVO(Wrapper<JiyangfuwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiyangfuwuView> selectListView(Wrapper<JiyangfuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiyangfuwuView selectView(Wrapper<JiyangfuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
