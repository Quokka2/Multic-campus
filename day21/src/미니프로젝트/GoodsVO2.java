package 미니프로젝트;

public class GoodsVO2 {
	private String code;
	private String name;
	private String price;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "GoodsVO [code=" + code + ", name=" + name + ", price=" + price + "]";
	}

}
