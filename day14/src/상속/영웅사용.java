package 상속;

public class 영웅사용 {

	public static void main(String[] args) {
		사람 p1 = new 사람();
		p1.name = "이순신";
		p1.age = 500;
		System.out.println(p1);
		p1.eat();
		
		맨 m = new 맨();
		m.run();
		
		수퍼맨 s = new 수퍼맨();
		s.age = 25000;
		s.fly = true;
		s.name = "클라크";
		s.power = 500000;
		s.eat();
		s.run();
		s.space();
	}

}
