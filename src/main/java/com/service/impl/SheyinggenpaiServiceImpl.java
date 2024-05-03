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


import com.dao.SheyinggenpaiDao;
import com.entity.SheyinggenpaiEntity;
import com.service.SheyinggenpaiService;
import com.entity.vo.SheyinggenpaiVO;
import com.entity.view.SheyinggenpaiView;

@Service("sheyinggenpaiService")
public class SheyinggenpaiServiceImpl extends ServiceImpl<SheyinggenpaiDao, SheyinggenpaiEntity> implements SheyinggenpaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SheyinggenpaiEntity> page = this.selectPage(
                new Query<SheyinggenpaiEntity>(params).getPage(),
                new EntityWrapper<SheyinggenpaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SheyinggenpaiEntity> wrapper) {
		  Page<SheyinggenpaiView> page =new Query<SheyinggenpaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SheyinggenpaiVO> selectListVO(Wrapper<SheyinggenpaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SheyinggenpaiVO selectVO(Wrapper<SheyinggenpaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SheyinggenpaiView> selectListView(Wrapper<SheyinggenpaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SheyinggenpaiView selectView(Wrapper<SheyinggenpaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
