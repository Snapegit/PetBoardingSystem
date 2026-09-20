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

import com.entity.SiliaozhongleiEntity;
import com.entity.view.SiliaozhongleiView;

import com.service.SiliaozhongleiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 饲料种类
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-07 21:40:09
 */
@RestController
@RequestMapping("/siliaozhonglei")
public class SiliaozhongleiController {
    @Autowired
    private SiliaozhongleiService siliaozhongleiService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,SiliaozhongleiEntity siliaozhonglei,
		HttpServletRequest request){
        EntityWrapper<SiliaozhongleiEntity> ew = new EntityWrapper<SiliaozhongleiEntity>();

		PageUtils page = siliaozhongleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, siliaozhonglei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,SiliaozhongleiEntity siliaozhonglei, 
		HttpServletRequest request){
        EntityWrapper<SiliaozhongleiEntity> ew = new EntityWrapper<SiliaozhongleiEntity>();

		PageUtils page = siliaozhongleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, siliaozhonglei), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( SiliaozhongleiEntity siliaozhonglei){
       	EntityWrapper<SiliaozhongleiEntity> ew = new EntityWrapper<SiliaozhongleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( siliaozhonglei, "siliaozhonglei")); 
        return R.ok().put("data", siliaozhongleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(SiliaozhongleiEntity siliaozhonglei){
        EntityWrapper< SiliaozhongleiEntity> ew = new EntityWrapper< SiliaozhongleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( siliaozhonglei, "siliaozhonglei")); 
		SiliaozhongleiView siliaozhongleiView =  siliaozhongleiService.selectView(ew);
		return R.ok("查询饲料种类成功").put("data", siliaozhongleiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        SiliaozhongleiEntity siliaozhonglei = siliaozhongleiService.selectById(id);
        return R.ok().put("data", siliaozhonglei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        SiliaozhongleiEntity siliaozhonglei = siliaozhongleiService.selectById(id);
        return R.ok().put("data", siliaozhonglei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SiliaozhongleiEntity siliaozhonglei, HttpServletRequest request){
        if(siliaozhongleiService.selectCount(new EntityWrapper<SiliaozhongleiEntity>().eq("siliaozhonglei", siliaozhonglei.getSiliaozhonglei()))>0) {
            return R.error("饲料种类已存在");
        }
    	//ValidatorUtils.validateEntity(siliaozhonglei);
        siliaozhongleiService.insert(siliaozhonglei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody SiliaozhongleiEntity siliaozhonglei, HttpServletRequest request){
        if(siliaozhongleiService.selectCount(new EntityWrapper<SiliaozhongleiEntity>().eq("siliaozhonglei", siliaozhonglei.getSiliaozhonglei()))>0) {
            return R.error("饲料种类已存在");
        }
    	//ValidatorUtils.validateEntity(siliaozhonglei);
        siliaozhongleiService.insert(siliaozhonglei);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody SiliaozhongleiEntity siliaozhonglei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(siliaozhonglei);
        if(siliaozhongleiService.selectCount(new EntityWrapper<SiliaozhongleiEntity>().ne("id", siliaozhonglei.getId()).eq("siliaozhonglei", siliaozhonglei.getSiliaozhonglei()))>0) {
            return R.error("饲料种类已存在");
        }
        siliaozhongleiService.updateById(siliaozhonglei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        siliaozhongleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
