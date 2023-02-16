package static1;

public class 직원 {
	String a;
	int b;
	char c;
	static int count;
	static int sum;
	static int avg;

	public 직원(String a, int b, char c) {
		count++;
		sum = sum + b;
		avg = sum / count;
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public String toString() {
		return "직원 [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

}
