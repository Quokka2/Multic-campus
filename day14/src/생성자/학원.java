package 생성자;

public class 학원 {

	public static void main(String[] args) {
		수강신청 a1 = new 수강신청("자바", "14:30", "홍길동");
		수강신청 a2 = new 수강신청("JSP", "09:30", "김길동");
		
		System.out.println(a1);
		System.out.println(a2);

	}

}
