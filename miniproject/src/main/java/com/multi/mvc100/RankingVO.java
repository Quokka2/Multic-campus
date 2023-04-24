package com.multi.mvc100;



public class RankingVO {

	private String userid;
	private String gender;
	private String local;
	private String name;
	private String store;
	private int count;
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "RankingVO [userid=" + userid + ", gender=" + gender + ", local=" + local + ", name=" + name + ", store="
				+ store + ", count=" + count + "]";
	}
	
}
