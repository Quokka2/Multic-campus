package 마무리문제;

public class 딸 {
	String name;
	char s;
	static int 아빠지갑;
	static int count;
	
	public 딸(String name, char s) {
		
		count++;
		아빠지갑 = 100000 - (count*1000);
		this.name = name;
		this.s = s;
	}
	
	public void TV보다() {
		System.out.println("리모콘을 찾는다.");
	}
	
	
	@Override
	public String toString() {
		return "딸 [name=" + name + ", s=" + s + "]";
	}
}
