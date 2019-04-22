package com.gaoyuanquan.java;

import java.util.ArrayList;

import com.mchange.lang.StringUtils;

/**
 * 字符串工具类
*/
public class StringUtil {


public boolean hasLenth(){
	String str = "ss";
	boolean empty = str.isEmpty();
	System.out.println(empty);
	return empty;
}
public boolean hasText(){
	String str = " ";
	if (str==" ") {
		System.out.println("str中有空格");
		return false;
	}else{
		boolean empty = str.isEmpty();
		return empty;
	}
}
public boolean isMobile(){
	String str = "";
	String reg = "({131|151|187|183|182|155}\\n+){11}";
	if (str.matches(reg)) {
		System.out.println("是手机号");
		return true;
	}else{
		System.out.println("不是手机号");
		return false;
	}
}
public boolean isEmail(){
	String str = "";
	String reg = "{www}{.}\\d{.}{com|cn|http}";
	if (str.matches(reg)) {
		System.out.println("是邮箱");
		return true;
	}else{
		System.out.println("不是邮箱");
		return false;
	}
}
public String reverse(String src){
	String str = "123354";
	String replace = str.replace(str, str);
	System.out.println(replace);
	return replace;
}

}