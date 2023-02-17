package 마무리문제;

public class 카운트스레드 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("추가요금 : " + (i*100) + "원");
			System.out.println("요금 : " +((i*100)+4800));

			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김.");
			}
		}
	}
}