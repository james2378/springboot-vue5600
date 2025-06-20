package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenfenyanzhengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenfenyanzhengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenfenyanzhengView;


/**
 * 身份验证
 *
 * @author 
 * @email 
 * @date 2023-02-15 17:45:41
 */
public interface ShenfenyanzhengService extends IService<ShenfenyanzhengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenfenyanzhengVO> selectListVO(Wrapper<ShenfenyanzhengEntity> wrapper);
   	
   	ShenfenyanzhengVO selectVO(@Param("ew") Wrapper<ShenfenyanzhengEntity> wrapper);
   	
   	List<ShenfenyanzhengView> selectListView(Wrapper<ShenfenyanzhengEntity> wrapper);
   	
   	ShenfenyanzhengView selectView(@Param("ew") Wrapper<ShenfenyanzhengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenfenyanzhengEntity> wrapper);
   	

}

