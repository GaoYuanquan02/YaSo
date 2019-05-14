package com.gaoyuanquan.bean;

public class Goodskind {

	private int kid;
	private String kname;
	public int getKid() {
		return kid;
	}
	public void setKid(int kid) {
		this.kid = kid;
	}
	public String getKname() {
		return kname;
	}
	public void setKname(String kname) {
		this.kname = kname;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + kid;
		result = prime * result + ((kname == null) ? 0 : kname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Goodskind other = (Goodskind) obj;
		if (kid != other.kid)
			return false;
		if (kname == null) {
			if (other.kname != null)
				return false;
		} else if (!kname.equals(other.kname))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Goodskind [kid=" + kid + ", kname=" + kname + "]";
	}
	

}
