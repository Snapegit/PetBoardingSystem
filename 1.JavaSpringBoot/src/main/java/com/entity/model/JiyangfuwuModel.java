package com.entity.model;

import com.entity.JiyangfuwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 寄养服务
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-07 21:40:09
 */
public class JiyangfuwuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 服务价格/天
	 */
	
	private Integer fuwujiage;
		
	/**
	 * 服务简介
	 */
	
	private String fuwujianjie;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：服务价格/天
	 */
	 
	public void setFuwujiage(Integer fuwujiage) {
		this.fuwujiage = fuwujiage;
	}
	
	/**
	 * 获取：服务价格/天
	 */
	public Integer getFuwujiage() {
		return fuwujiage;
	}
				
	
	/**
	 * 设置：服务简介
	 */
	 
	public void setFuwujianjie(String fuwujianjie) {
		this.fuwujianjie = fuwujianjie;
	}
	
	/**
	 * 获取：服务简介
	 */
	public String getFuwujianjie() {
		return fuwujianjie;
	}
			
}
