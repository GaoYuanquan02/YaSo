package com.gaoyuanquan.service;

import java.util.List;

import com.gaoyuanquan.bean.Criminal;

public interface CriminalService {
	//列表
	List getList(String name);
	//添加
	void addCriminal(Criminal criminal);
	//回显+查看详情
	Criminal selById(int id);
	//修改
	void updCriminal(Criminal criminal);
	//删除
	void del(int id);

}
