package com.gaoyuanquan.service;

import java.util.List;

import com.gaoyuanquan.bean.Brand;
import com.gaoyuanquan.bean.Goods;
import com.gaoyuanquan.bean.Goodskind;

public interface GoodsService {

	List getList(String gname);

	List<Brand> getBrand();

	List<Goodskind> getKind();

	void add(Goods goods);

	Goods selById(Integer gid);

	void upd(Goods goods);

	void delAll(String ids);

}
