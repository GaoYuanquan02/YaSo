package com.gaoyuanquan.utils;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestParam;

public class PageUtils {
	// 当前页
	private int cpage;
	// 总页数
	private int totalPage;
	// 总条数
	private int count;
	// 分页单位
	private int pageSize;
	// 上一页
	private int prevPage;
	// 下一页
	private int nextPage;
	// 起始位置
	private int startPage;

	public PageUtils(int cpage, int count, int pageSize, String url, HttpServletRequest request) {
		this.count = count;
		this.pageSize = pageSize;
		// 处理总页数
		this.initTotalPage();
		// 处理当前页
		this.initCpage(cpage);
		// 处理上一页
		this.initPrevPage();
		// 处理下一页
		this.initnextPage();
		// 处理起始位置
		this.initStartPage();
		// 把路径封装
		this.initFenye(request, url);

	}

	
	//把路径封装
	private void initFenye(HttpServletRequest request, String url) {
		// 如果url中有? 后面追加条件时用& url中没有? 后面追加?
		String flag = url.indexOf("?") != -1 ? "&" : "?";
		String fenye = "当前" + cpage + "/" + totalPage + "页/共" + count + "条数据<a href='" + url + flag
				+ "cpage=1'> 首页&nbsp;  </a><a href='" + url + flag + "cpage=" + prevPage + "'> 上一页 &nbsp; </a><a href='" + url + flag
				+ "cpage=" + nextPage + "'> 下一页&nbsp;  </a><a href='" + url + flag + "cpage=" + totalPage + "'> 尾页</a>";

		request.setAttribute("fenye", fenye);
	}

	// 处理起始位置
	private void initStartPage() {
		// 计算limit后的第一个参数 (当前页-1)*pageSize
		this.startPage = (cpage - 1) * pageSize;

	}

	// 处理下一页
	private void initnextPage() {
		if (cpage >= totalPage) {
			this.nextPage = totalPage;
		} else {
			this.nextPage = cpage + 1;
		}

	}

	// 处理上一页
	private void initPrevPage() {
		// <a href="list?cpage=${cpage<=1?1:cpage-1 }&name=${name }">上一页</a>
		if (cpage <= 1) {
			this.prevPage = 1;
		} else {
			this.prevPage = cpage - 1;
		}
	}

	// 处理总页数
	private void initTotalPage() {
		// 计算总页数 ==总条数/pageSize 有余数+1
		this.totalPage = (count / pageSize) + (count % pageSize == 0 ? 0 : 1);

	}

	// 处理当前页
	private void initCpage(int cpage2) {
		if (cpage2 >= totalPage) {// 如果当前页大一等于最后一页 当前页=最后一页
			this.cpage = totalPage;
		} else if (cpage2 <= 1) {// 如果当前页小一等于1 当前页=1
			this.cpage = 1;
		} else {
			this.cpage = cpage2;
		}
	}

	public int getCpage() {
		return cpage;
	}

	public void setCpage(int cpage) {
		this.cpage = cpage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPrevPage() {
		return prevPage;
	}

	public void setPrevPage(int prevPage) {
		this.prevPage = prevPage;
	}

	public int getNextPage() {
		return nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

}
