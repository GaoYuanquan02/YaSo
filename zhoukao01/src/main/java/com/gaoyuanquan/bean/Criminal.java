package com.gaoyuanquan.bean;

public class Criminal {
	private Integer cid;
	private String name;
	private Integer age;
	private String sex;
	private String desce;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getDesce() {
		return desce;
	}
	public void setDesce(String desce) {
		this.desce = desce;
	}
	@Override
	public String toString() {
		return "Criminal [cid=" + cid + ", name=" + name + ", age=" + age + ", sex=" + sex + ", desce=" + desce + "]";
	}
	
	
	
}
