package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoyihetongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoyihetongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoyihetongView;


/**
 * 交易合同
 *
 * @author 
 * @email 
 * @date 2023-02-15 17:45:40
 */
public interface JiaoyihetongService extends IService<JiaoyihetongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoyihetongVO> selectListVO(Wrapper<JiaoyihetongEntity> wrapper);
   	
   	JiaoyihetongVO selectVO(@Param("ew") Wrapper<JiaoyihetongEntity> wrapper);
   	
   	List<JiaoyihetongView> selectListView(Wrapper<JiaoyihetongEntity> wrapper);
   	
   	JiaoyihetongView selectView(@Param("ew") Wrapper<JiaoyihetongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoyihetongEntity> wrapper);
   	

}

