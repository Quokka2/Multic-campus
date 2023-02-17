package 상속응용;

public class a2 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print("@");
		}System.out.println("");
	}
}
