package 상속응용;

public class 증가감소 {

	public static void main(String[] args) {
		증가스레드 plus = new 증가스레드();
		감소스레드 minus = new 감소스레드();
		// Thread를 상속받아서 메소드 사용할때는 기존에 작성한 이름이 아니라
		// start()메소드를 입력해서 실행해야한다
		plus.start();
		minus.start();

	}

}
