package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShenfenyanzhengEntity;
import com.entity.view.ShenfenyanzhengView;

import com.service.ShenfenyanzhengService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 身份验证
 * 后端接口
 * @author 
 * @email 
 * @date 2023-02-15 17:45:41
 */
@RestController
@RequestMapping("/shenfenyanzheng")
public class ShenfenyanzhengController {
    @Autowired
    private ShenfenyanzhengService shenfenyanzhengService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShenfenyanzhengEntity shenfenyanzheng,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			shenfenyanzheng.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShenfenyanzhengEntity> ew = new EntityWrapper<ShenfenyanzhengEntity>();

		PageUtils page = shenfenyanzhengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shenfenyanzheng), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShenfenyanzhengEntity shenfenyanzheng, 
		HttpServletRequest request){
        EntityWrapper<ShenfenyanzhengEntity> ew = new EntityWrapper<ShenfenyanzhengEntity>();

		PageUtils page = shenfenyanzhengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shenfenyanzheng), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShenfenyanzhengEntity shenfenyanzheng){
       	EntityWrapper<ShenfenyanzhengEntity> ew = new EntityWrapper<ShenfenyanzhengEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shenfenyanzheng, "shenfenyanzheng")); 
        return R.ok().put("data", shenfenyanzhengService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShenfenyanzhengEntity shenfenyanzheng){
        EntityWrapper< ShenfenyanzhengEntity> ew = new EntityWrapper< ShenfenyanzhengEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shenfenyanzheng, "shenfenyanzheng")); 
		ShenfenyanzhengView shenfenyanzhengView =  shenfenyanzhengService.selectView(ew);
		return R.ok("查询身份验证成功").put("data", shenfenyanzhengView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShenfenyanzhengEntity shenfenyanzheng = shenfenyanzhengService.selectById(id);
        return R.ok().put("data", shenfenyanzheng);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShenfenyanzhengEntity shenfenyanzheng = shenfenyanzhengService.selectById(id);
        return R.ok().put("data", shenfenyanzheng);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShenfenyanzhengEntity shenfenyanzheng, HttpServletRequest request){
    	shenfenyanzheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shenfenyanzheng);
        shenfenyanzhengService.insert(shenfenyanzheng);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShenfenyanzhengEntity shenfenyanzheng, HttpServletRequest request){
    	shenfenyanzheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shenfenyanzheng);
        shenfenyanzhengService.insert(shenfenyanzheng);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShenfenyanzhengEntity shenfenyanzheng, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shenfenyanzheng);
        shenfenyanzhengService.updateById(shenfenyanzheng);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shenfenyanzhengService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ShenfenyanzhengEntity> wrapper = new EntityWrapper<ShenfenyanzhengEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = shenfenyanzhengService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
