package 자동차경주게임;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MyThread extends Thread {

	int x, y;
	JLabel label;

	public MyThread(String file, int x, int y) {
		this.x = x;
		this.y = y;
		ImageIcon icon = new ImageIcon();
		label = new JLabel();
		label.setIcon(icon);
		label.setBounds(x, y, 100, 100);
	}

	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			Random r = new Random();
			int move = r.nextInt(50);
			x = x + move;
			label.setBounds(x, y, 100, 100);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
