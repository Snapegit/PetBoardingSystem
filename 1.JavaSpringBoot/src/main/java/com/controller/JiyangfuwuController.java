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

import com.entity.JiyangfuwuEntity;
import com.entity.view.JiyangfuwuView;

import com.service.JiyangfuwuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 寄养服务
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-07 21:40:09
 */
@RestController
@RequestMapping("/jiyangfuwu")
public class JiyangfuwuController {
    @Autowired
    private JiyangfuwuService jiyangfuwuService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiyangfuwuEntity jiyangfuwu,
		HttpServletRequest request){
        EntityWrapper<JiyangfuwuEntity> ew = new EntityWrapper<JiyangfuwuEntity>();

		PageUtils page = jiyangfuwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiyangfuwu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiyangfuwuEntity jiyangfuwu, 
		HttpServletRequest request){
        EntityWrapper<JiyangfuwuEntity> ew = new EntityWrapper<JiyangfuwuEntity>();

		PageUtils page = jiyangfuwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiyangfuwu), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiyangfuwuEntity jiyangfuwu){
       	EntityWrapper<JiyangfuwuEntity> ew = new EntityWrapper<JiyangfuwuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiyangfuwu, "jiyangfuwu")); 
        return R.ok().put("data", jiyangfuwuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiyangfuwuEntity jiyangfuwu){
        EntityWrapper< JiyangfuwuEntity> ew = new EntityWrapper< JiyangfuwuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiyangfuwu, "jiyangfuwu")); 
		JiyangfuwuView jiyangfuwuView =  jiyangfuwuService.selectView(ew);
		return R.ok("查询寄养服务成功").put("data", jiyangfuwuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiyangfuwuEntity jiyangfuwu = jiyangfuwuService.selectById(id);
        return R.ok().put("data", jiyangfuwu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiyangfuwuEntity jiyangfuwu = jiyangfuwuService.selectById(id);
        return R.ok().put("data", jiyangfuwu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiyangfuwuEntity jiyangfuwu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jiyangfuwu);
        jiyangfuwuService.insert(jiyangfuwu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiyangfuwuEntity jiyangfuwu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jiyangfuwu);
        jiyangfuwuService.insert(jiyangfuwu);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiyangfuwuEntity jiyangfuwu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiyangfuwu);
        jiyangfuwuService.updateById(jiyangfuwu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiyangfuwuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
