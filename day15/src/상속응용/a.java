package 상속응용;

public class a extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("$");
		}System.out.println("");
	}
}
