package 미니프로젝트;

public class ProVO2 {

	private int code;
	private String name;
	private String cost;
	private String sort;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	@Override
	public String toString() {
		return "ProVO2 [code=" + code + ", name=" + name + ", cost=" + cost + ", sort=" + sort + "]";
	}

}
