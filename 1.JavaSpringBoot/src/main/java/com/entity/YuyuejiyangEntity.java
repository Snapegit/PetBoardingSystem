package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 预约寄养
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-07 21:40:09
 */
@TableName("yuyuejiyang")
public class YuyuejiyangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuyuejiyangEntity() {
		
	}
	
	public YuyuejiyangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 寄养编号
	 */
					
	private String jiyangbianhao;
	
	/**
	 * 服务名称
	 */
					
	private String fuwumingcheng;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 服务价格/天
	 */
					
	private Integer fuwujiage;
	
	/**
	 * 寄养日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jiyangriqi;
	
	/**
	 * 寄养天数
	 */
					
	private Integer jiyangtianshu;
	
	/**
	 * 总费用
	 */
					
	private Integer zongfeiyong;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机号
	 */
					
	private String shoujihao;
	
	/**
	 * 宠物信息
	 */
					
	private String chongwuxinxi;
	
	/**
	 * 登记时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date dengjishijian;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：寄养编号
	 */
	public void setJiyangbianhao(String jiyangbianhao) {
		this.jiyangbianhao = jiyangbianhao;
	}
	/**
	 * 获取：寄养编号
	 */
	public String getJiyangbianhao() {
		return jiyangbianhao;
	}
	/**
	 * 设置：服务名称
	 */
	public void setFuwumingcheng(String fuwumingcheng) {
		this.fuwumingcheng = fuwumingcheng;
	}
	/**
	 * 获取：服务名称
	 */
	public String getFuwumingcheng() {
		return fuwumingcheng;
	}
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
	 * 设置：寄养日期
	 */
	public void setJiyangriqi(Date jiyangriqi) {
		this.jiyangriqi = jiyangriqi;
	}
	/**
	 * 获取：寄养日期
	 */
	public Date getJiyangriqi() {
		return jiyangriqi;
	}
	/**
	 * 设置：寄养天数
	 */
	public void setJiyangtianshu(Integer jiyangtianshu) {
		this.jiyangtianshu = jiyangtianshu;
	}
	/**
	 * 获取：寄养天数
	 */
	public Integer getJiyangtianshu() {
		return jiyangtianshu;
	}
	/**
	 * 设置：总费用
	 */
	public void setZongfeiyong(Integer zongfeiyong) {
		this.zongfeiyong = zongfeiyong;
	}
	/**
	 * 获取：总费用
	 */
	public Integer getZongfeiyong() {
		return zongfeiyong;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：手机号
	 */
	public void setShoujihao(String shoujihao) {
		this.shoujihao = shoujihao;
	}
	/**
	 * 获取：手机号
	 */
	public String getShoujihao() {
		return shoujihao;
	}
	/**
	 * 设置：宠物信息
	 */
	public void setChongwuxinxi(String chongwuxinxi) {
		this.chongwuxinxi = chongwuxinxi;
	}
	/**
	 * 获取：宠物信息
	 */
	public String getChongwuxinxi() {
		return chongwuxinxi;
	}
	/**
	 * 设置：登记时间
	 */
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
