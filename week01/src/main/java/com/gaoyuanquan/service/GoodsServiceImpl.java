package com.gaoyuanquan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaoyuanquan.bean.Brand;
import com.gaoyuanquan.bean.Goods;
import com.gaoyuanquan.bean.Goodskind;
import com.gaoyuanquan.mapper.GoodsMapper;

@Service
public class GoodsServiceImpl implements GoodsService{
	@Autowired
	private GoodsMapper mapper;

	public List getList(String gname) {
		return mapper.getList(gname);
	}

	public List<Brand> getBrand() {
		// TODO Auto-generated method stub
		return mapper.getBrand();
	}

	public List<Goodskind> getKind() {
		return mapper.getKind();
	}

	public void add(Goods goods) {
		mapper.add(goods);
	}

	public Goods selById(Integer gid) {
		return mapper.selById(gid);
	}

	public void upd(Goods goods) {
		mapper.upd(goods);
	}

	public void delAll(String ids) {
		mapper.delAll(ids);
	}
	
}
