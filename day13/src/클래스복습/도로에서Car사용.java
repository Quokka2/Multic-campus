package 클래스복습;

public class 도로에서Car사용 {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.color = "gray";
		System.out.println(car1.color);
		car1.run();
		
		Car car2 = new Car();
		car2.color = "gray색";
		System.out.println(car2.color);
		car2.run();
		car2.up();
	}

}
