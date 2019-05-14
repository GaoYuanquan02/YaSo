package com.gaoyuanquan.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gaoyuanquan.bean.Brand;
import com.gaoyuanquan.bean.Goods;
import com.gaoyuanquan.bean.Goodskind;
import com.gaoyuanquan.service.GoodsService;
import com.gaoyuanquan.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class GoodsController {
	@Autowired
	private GoodsService service;
	//列表
	@RequestMapping("list.do")
	public String getList(HttpServletRequest request,@RequestParam(defaultValue="")String gname,@RequestParam(defaultValue="1")Integer cpage){
		PageHelper.startPage(cpage, 3);
		List list = service.getList(gname);
		PageInfo info = new PageInfo(list);
		PageUtils page = new PageUtils(cpage, (int)info.getTotal(), 3, "list.do?gname="+gname, request);
		
		request.setAttribute("list", info.getList());
		request.setAttribute("gname", gname);
		return "list";
	}
	//查询品牌
	@RequestMapping("getBrand.do")
	@ResponseBody
	public Object getBrand(HttpServletRequest request){
		List<Brand> list = service.getBrand();
		System.out.println(list+"hhhh");
		request.setAttribute("list", list);
		
		return list;
	}
	//查询种类
	@RequestMapping("getKind.do")
	@ResponseBody
	public Object getKind(HttpServletRequest request){
		List<Goodskind> list = service.getKind(); 
		request.setAttribute("list", list);
		return list;
	}
	//添加
	@RequestMapping("add.do")
	@ResponseBody
	public boolean add(HttpServletRequest request,Goods goods){
		try {
			service.add(goods);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	//修改
	@RequestMapping("upd.do")
	@ResponseBody
	public boolean upd(HttpServletRequest request,Goods goods){
		try {
			service.upd(goods);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	//批量删除
	@RequestMapping("delAll.do")
	@ResponseBody
	public Object delAll(HttpServletRequest request,String ids){
		if(ids!=null){
			try {
				service.delAll(ids);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}else{
			
		}
	}
	//撤销删除
	
	//回显
	@RequestMapping("selById.do")
	@ResponseBody
	public Object selById(HttpServletRequest request,Integer gid){
		Goods goods = service.selById(gid);
		request.setAttribute("goods",goods);
		
		return goods;
	}
	
}
