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


import com.dao.DiscusssheyinggenpaiDao;
import com.entity.DiscusssheyinggenpaiEntity;
import com.service.DiscusssheyinggenpaiService;
import com.entity.vo.DiscusssheyinggenpaiVO;
import com.entity.view.DiscusssheyinggenpaiView;

@Service("discusssheyinggenpaiService")
public class DiscusssheyinggenpaiServiceImpl extends ServiceImpl<DiscusssheyinggenpaiDao, DiscusssheyinggenpaiEntity> implements DiscusssheyinggenpaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusssheyinggenpaiEntity> page = this.selectPage(
                new Query<DiscusssheyinggenpaiEntity>(params).getPage(),
                new EntityWrapper<DiscusssheyinggenpaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusssheyinggenpaiEntity> wrapper) {
		  Page<DiscusssheyinggenpaiView> page =new Query<DiscusssheyinggenpaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusssheyinggenpaiVO> selectListVO(Wrapper<DiscusssheyinggenpaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusssheyinggenpaiVO selectVO(Wrapper<DiscusssheyinggenpaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusssheyinggenpaiView> selectListView(Wrapper<DiscusssheyinggenpaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusssheyinggenpaiView selectView(Wrapper<DiscusssheyinggenpaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
