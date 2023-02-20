package 복습;

public class 직원사용 extends 직원 {

	public static void main(String[] args) {
		직원사용 work = new 직원사용();
		work.name = "홍길동";
		work.address = "강남구";
		work.salary = 10000;
		System.out.println(work.name);
	}
};