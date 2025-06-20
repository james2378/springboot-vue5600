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


import com.dao.JiaoyihetongDao;
import com.entity.JiaoyihetongEntity;
import com.service.JiaoyihetongService;
import com.entity.vo.JiaoyihetongVO;
import com.entity.view.JiaoyihetongView;

@Service("jiaoyihetongService")
public class JiaoyihetongServiceImpl extends ServiceImpl<JiaoyihetongDao, JiaoyihetongEntity> implements JiaoyihetongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoyihetongEntity> page = this.selectPage(
                new Query<JiaoyihetongEntity>(params).getPage(),
                new EntityWrapper<JiaoyihetongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoyihetongEntity> wrapper) {
		  Page<JiaoyihetongView> page =new Query<JiaoyihetongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoyihetongVO> selectListVO(Wrapper<JiaoyihetongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoyihetongVO selectVO(Wrapper<JiaoyihetongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoyihetongView> selectListView(Wrapper<JiaoyihetongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoyihetongView selectView(Wrapper<JiaoyihetongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
