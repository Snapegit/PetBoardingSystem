package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongwusiliaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongwusiliaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwusiliaoView;


/**
 * 宠物饲料
 *
 * @author 
 * @email 
 * @date 2024-04-07 21:40:10
 */
public interface ChongwusiliaoService extends IService<ChongwusiliaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongwusiliaoVO> selectListVO(Wrapper<ChongwusiliaoEntity> wrapper);
   	
   	ChongwusiliaoVO selectVO(@Param("ew") Wrapper<ChongwusiliaoEntity> wrapper);
   	
   	List<ChongwusiliaoView> selectListView(Wrapper<ChongwusiliaoEntity> wrapper);
   	
   	ChongwusiliaoView selectView(@Param("ew") Wrapper<ChongwusiliaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongwusiliaoEntity> wrapper);

   	

}

