package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JiyangrizhiEntity;
import com.entity.view.JiyangrizhiView;

import com.service.JiyangrizhiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 寄养日志
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-07 21:40:09
 */
@RestController
@RequestMapping("/jiyangrizhi")
public class JiyangrizhiController {
    @Autowired
    private JiyangrizhiService jiyangrizhiService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiyangrizhiEntity jiyangrizhi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			jiyangrizhi.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiyangrizhiEntity> ew = new EntityWrapper<JiyangrizhiEntity>();

		PageUtils page = jiyangrizhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiyangrizhi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiyangrizhiEntity jiyangrizhi, 
		HttpServletRequest request){
        EntityWrapper<JiyangrizhiEntity> ew = new EntityWrapper<JiyangrizhiEntity>();

		PageUtils page = jiyangrizhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiyangrizhi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiyangrizhiEntity jiyangrizhi){
       	EntityWrapper<JiyangrizhiEntity> ew = new EntityWrapper<JiyangrizhiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiyangrizhi, "jiyangrizhi")); 
        return R.ok().put("data", jiyangrizhiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiyangrizhiEntity jiyangrizhi){
        EntityWrapper< JiyangrizhiEntity> ew = new EntityWrapper< JiyangrizhiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiyangrizhi, "jiyangrizhi")); 
		JiyangrizhiView jiyangrizhiView =  jiyangrizhiService.selectView(ew);
		return R.ok("查询寄养日志成功").put("data", jiyangrizhiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiyangrizhiEntity jiyangrizhi = jiyangrizhiService.selectById(id);
        return R.ok().put("data", jiyangrizhi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiyangrizhiEntity jiyangrizhi = jiyangrizhiService.selectById(id);
        return R.ok().put("data", jiyangrizhi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiyangrizhiEntity jiyangrizhi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jiyangrizhi);
        jiyangrizhiService.insert(jiyangrizhi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiyangrizhiEntity jiyangrizhi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jiyangrizhi);
        jiyangrizhiService.insert(jiyangrizhi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiyangrizhiEntity jiyangrizhi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiyangrizhi);
        jiyangrizhiService.updateById(jiyangrizhi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiyangrizhiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
