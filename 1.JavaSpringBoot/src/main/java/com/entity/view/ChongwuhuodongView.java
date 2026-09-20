package com.entity.view;

import com.entity.ChongwuhuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 宠物活动
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-07 21:40:10
 */
@TableName("chongwuhuodong")
public class ChongwuhuodongView  extends ChongwuhuodongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChongwuhuodongView(){
	}
 
 	public ChongwuhuodongView(ChongwuhuodongEntity chongwuhuodongEntity){
 	try {
			BeanUtils.copyProperties(this, chongwuhuodongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
