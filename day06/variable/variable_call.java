package variable;

public class variable_call {

	public static void main(String[] args) {
		
		//선언!! 타입 변수명!! ==> 변수가 생성됨!
		//기본 데이터 => 정수, 실수, 문자1, 논리
		
		int num = 100; //정수변수
		double num2 = 22.2; //실수변수 22.0, 22(정수를 포함하고 있음)
		char c = '한' ; //한글자만
		boolean b = true; //false
		num = 200; //OK!!
		//b = 300;
		System.out.println(num);
		System.out.println(num2);
		System.out.println(c);
		System.out.println(b);
	}

}
