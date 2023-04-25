package com.multi.mvc100;



public class RankingVO {

	private String userid;
	private String gender;
	private String local;
	private String storeAddress;
	private String name;
	private int count;
	private int num;
	private String img;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getStoreAddress() {
		return storeAddress;
	}
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "RankingVO [userid=" + userid + ", gender=" + gender + ", local=" + local + ", storeAddress="
				+ storeAddress + ", name=" + name + ", count=" + count + ", num=" + num + ", img=" + img + "]";
	}
	
}
