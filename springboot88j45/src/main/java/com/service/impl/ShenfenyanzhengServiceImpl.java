package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShenfenyanzhengDao;
import com.entity.ShenfenyanzhengEntity;
import com.service.ShenfenyanzhengService;
import com.entity.vo.ShenfenyanzhengVO;
import com.entity.view.ShenfenyanzhengView;

@Service("shenfenyanzhengService")
public class ShenfenyanzhengServiceImpl extends ServiceImpl<ShenfenyanzhengDao, ShenfenyanzhengEntity> implements ShenfenyanzhengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenfenyanzhengEntity> page = this.selectPage(
                new Query<ShenfenyanzhengEntity>(params).getPage(),
                new EntityWrapper<ShenfenyanzhengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenfenyanzhengEntity> wrapper) {
		  Page<ShenfenyanzhengView> page =new Query<ShenfenyanzhengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShenfenyanzhengVO> selectListVO(Wrapper<ShenfenyanzhengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenfenyanzhengVO selectVO(Wrapper<ShenfenyanzhengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenfenyanzhengView> selectListView(Wrapper<ShenfenyanzhengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenfenyanzhengView selectView(Wrapper<ShenfenyanzhengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
