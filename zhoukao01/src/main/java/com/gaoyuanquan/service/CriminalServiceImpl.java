package com.gaoyuanquan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaoyuanquan.bean.Criminal;
import com.gaoyuanquan.mapper.CriminalMapper;

@Service
public class CriminalServiceImpl implements CriminalService{
	@Autowired
	private CriminalMapper mapper;
	//列表展示
	public List getList(String name) {
		return mapper.getList(name);
	}
	//添加
	public void addCriminal(Criminal criminal) {
		mapper.addCriminal(criminal);
	}
	//回显+查看详情
	public Criminal selById(int id) {
		return mapper.selById(id);
	}
	//修改
	public void updCriminal(Criminal criminal) {
		mapper.updCriminal(criminal);
	}
	//删除
	public void del(int id) {
		mapper.del(id);
	}
}
