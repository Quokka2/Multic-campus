package 마무리문제;

public class 시간당택시요금증가표 {

	public static void main(String[] args) {
		카운트스레드 count = new 카운트스레드();
		타이머스레드 timer = new 타이머스레드();
		이미지스레드 img = new 이미지스레드();

		count.start();
		timer.start();
		img.start();

	}

}
