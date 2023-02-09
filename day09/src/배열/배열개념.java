package 배열;

public class 배열개념 {

	public static void main(String[] args) {
		String[] p = {"수", "우", "미", "양", "가"};
		System.out.println(p[0]);
		System.out.println(p[1]);
		System.out.println(p[2]);
		System.out.println(p[3]);
		System.out.println(p[4]);
		System.out.println(p.length);
		//중간에 배열변수를 변경하면 이후 실행에 교체된다.
		p[2] = "최우수";
		p[4] = "우수";
		System.out.println(p[2]);
		System.out.println(p[4]);
		
		String[] p1 =new String[5];
		p1[0] = "수";
		p1[1] = "우";
		p1[2] = "미";
		p1[3] = "양";
		p1[4] = "가";
		System.out.println(p1[0]);
		System.out.println(p1[1]);
		System.out.println(p1[2]);
		System.out.println(p1[3]);
		System.out.println(p1[4]);
		System.out.println(p1.length);
	}

}
