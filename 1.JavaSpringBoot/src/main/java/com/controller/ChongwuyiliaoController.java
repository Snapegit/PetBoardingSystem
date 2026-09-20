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

import com.entity.ChongwuyiliaoEntity;
import com.entity.view.ChongwuyiliaoView;

import com.service.ChongwuyiliaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 宠物医疗
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-07 21:40:10
 */
@RestController
@RequestMapping("/chongwuyiliao")
public class ChongwuyiliaoController {
    @Autowired
    private ChongwuyiliaoService chongwuyiliaoService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChongwuyiliaoEntity chongwuyiliao,
		HttpServletRequest request){
        EntityWrapper<ChongwuyiliaoEntity> ew = new EntityWrapper<ChongwuyiliaoEntity>();

		PageUtils page = chongwuyiliaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwuyiliao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChongwuyiliaoEntity chongwuyiliao, 
		HttpServletRequest request){
        EntityWrapper<ChongwuyiliaoEntity> ew = new EntityWrapper<ChongwuyiliaoEntity>();

		PageUtils page = chongwuyiliaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwuyiliao), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChongwuyiliaoEntity chongwuyiliao){
       	EntityWrapper<ChongwuyiliaoEntity> ew = new EntityWrapper<ChongwuyiliaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chongwuyiliao, "chongwuyiliao")); 
        return R.ok().put("data", chongwuyiliaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChongwuyiliaoEntity chongwuyiliao){
        EntityWrapper< ChongwuyiliaoEntity> ew = new EntityWrapper< ChongwuyiliaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chongwuyiliao, "chongwuyiliao")); 
		ChongwuyiliaoView chongwuyiliaoView =  chongwuyiliaoService.selectView(ew);
		return R.ok("查询宠物医疗成功").put("data", chongwuyiliaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChongwuyiliaoEntity chongwuyiliao = chongwuyiliaoService.selectById(id);
        return R.ok().put("data", chongwuyiliao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChongwuyiliaoEntity chongwuyiliao = chongwuyiliaoService.selectById(id);
        return R.ok().put("data", chongwuyiliao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChongwuyiliaoEntity chongwuyiliao, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chongwuyiliao);
        chongwuyiliaoService.insert(chongwuyiliao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChongwuyiliaoEntity chongwuyiliao, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chongwuyiliao);
        chongwuyiliaoService.insert(chongwuyiliao);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChongwuyiliaoEntity chongwuyiliao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chongwuyiliao);
        chongwuyiliaoService.updateById(chongwuyiliao);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chongwuyiliaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
