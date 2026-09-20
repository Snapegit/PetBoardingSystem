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


import com.dao.JiyangrizhiDao;
import com.entity.JiyangrizhiEntity;
import com.service.JiyangrizhiService;
import com.entity.vo.JiyangrizhiVO;
import com.entity.view.JiyangrizhiView;

@Service("jiyangrizhiService")
public class JiyangrizhiServiceImpl extends ServiceImpl<JiyangrizhiDao, JiyangrizhiEntity> implements JiyangrizhiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiyangrizhiEntity> page = this.selectPage(
                new Query<JiyangrizhiEntity>(params).getPage(),
                new EntityWrapper<JiyangrizhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiyangrizhiEntity> wrapper) {
		  Page<JiyangrizhiView> page =new Query<JiyangrizhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<JiyangrizhiVO> selectListVO(Wrapper<JiyangrizhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiyangrizhiVO selectVO(Wrapper<JiyangrizhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiyangrizhiView> selectListView(Wrapper<JiyangrizhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiyangrizhiView selectView(Wrapper<JiyangrizhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
