package com.dao;

import com.entity.ShenfenyanzhengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenfenyanzhengVO;
import com.entity.view.ShenfenyanzhengView;


/**
 * 身份验证
 * 
 * @author 
 * @email 
 * @date 2023-02-15 17:45:41
 */
public interface ShenfenyanzhengDao extends BaseMapper<ShenfenyanzhengEntity> {
	
	List<ShenfenyanzhengVO> selectListVO(@Param("ew") Wrapper<ShenfenyanzhengEntity> wrapper);
	
	ShenfenyanzhengVO selectVO(@Param("ew") Wrapper<ShenfenyanzhengEntity> wrapper);
	
	List<ShenfenyanzhengView> selectListView(@Param("ew") Wrapper<ShenfenyanzhengEntity> wrapper);

	List<ShenfenyanzhengView> selectListView(Pagination page,@Param("ew") Wrapper<ShenfenyanzhengEntity> wrapper);
	
	ShenfenyanzhengView selectView(@Param("ew") Wrapper<ShenfenyanzhengEntity> wrapper);
	

}
