package 생성자;

public class 컴퓨터 {
	 String money;
	 String com;
	 int size;
	 
	public 컴퓨터(String money, String com, int size) {

		this.money = money;
		this.com = com;
		this.size = size;
	}

	@Override
	public String toString() {
		return "컴퓨터 [money=" + money + ", com=" + com + ", size=" + size + "]";
	}
	
}
