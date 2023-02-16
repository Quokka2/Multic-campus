package 마무리문제;

public class Mask {
	String c;
	int price;
	int num;
	
	public Mask(String c, int price, int num) {
		super();
		this.c = c;
		this.price = price;
		this.num = num;
	}

	@Override
	public String toString() {
		return "Mask [c=" + c + ", price=" + price + ", num=" + num + "]";
	}

}
