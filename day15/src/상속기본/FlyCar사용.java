package 상속기본;

public class FlyCar사용 extends Object{

	public static void main(String[] args) {
		FlyCar fly = new FlyCar();
		fly.color = "검정색";
		fly.fly = true;
		fly.fly();
		fly.run();
	}

}
