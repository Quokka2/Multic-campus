package 자동차경주게임;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame {

	public static void main(String[] args) {
		CarGame f = new CarGame();
	}

	public CarGame() {
		setTitle("자동차 경주게임");
		setSize(500, 500);
		setLayout(null);
		
		MyThread car1 = new MyThread("6.png", 100, 0);
		MyThread car2 = new MyThread("7.png", 100, 100);
		MyThread car3 = new MyThread("8.png", 100, 200);
		
		car1.start();
		car2.start();
		car3.start();
		
		setVisible(true);
	}

	public class MyThread extends Thread {

		int x, y;
		JLabel label;

		public MyThread(String file, int x, int y) {
			this.x = x;
			this.y = y;
			ImageIcon icon = new ImageIcon(file);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 100, 100);
			add(label);
		}

		@Override
		public void run() {
			
			Random r = new Random();
			for (int i = 0; i < 200; i++) {
				int move = r.nextInt(50);
				x = x + move;
				label.setBounds(x, y, 100, 100);
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
