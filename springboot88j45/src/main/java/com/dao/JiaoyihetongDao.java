package com.dao;

import com.entity.JiaoyihetongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoyihetongVO;
import com.entity.view.JiaoyihetongView;


/**
 * 交易合同
 * 
 * @author 
 * @email 
 * @date 2023-02-15 17:45:40
 */
public interface JiaoyihetongDao extends BaseMapper<JiaoyihetongEntity> {
	
	List<JiaoyihetongVO> selectListVO(@Param("ew") Wrapper<JiaoyihetongEntity> wrapper);
	
	JiaoyihetongVO selectVO(@Param("ew") Wrapper<JiaoyihetongEntity> wrapper);
	
	List<JiaoyihetongView> selectListView(@Param("ew") Wrapper<JiaoyihetongEntity> wrapper);

	List<JiaoyihetongView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoyihetongEntity> wrapper);
	
	JiaoyihetongView selectView(@Param("ew") Wrapper<JiaoyihetongEntity> wrapper);
	

}
