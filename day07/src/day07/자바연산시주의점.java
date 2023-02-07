package day07;

public class 자바연산시주의점 {

	public static void main(String[] args) {

		int x = 20;
		int y = 30;
		
		int x1 = 20;
		double y1 = 30;
		
		
		System.out.println(x / y);
		System.out.println(x / (double)y);
		System.out.println(x1 / y1);
		// 계산시 하나라도 실수면 결과는 무조건 실수!
		// CPU가 정수를 실수로 변환해서 할 수 있음
		//강제타입변환(강제형변환)
	}

}
