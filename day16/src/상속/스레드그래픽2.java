package 상속;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 스레드그래픽2 extends JFrame {

	JLabel count, count1, image, time;

	public static void main(String[] args) {
		스레드그래픽2 f = new 스레드그래픽2();

	}

	public 스레드그래픽2() {
		setTitle("내 스레드 그래픽");
		setSize(700, 300);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		Font font = new Font("맑은고딕", Font.BOLD, 30);
		count = new JLabel("카운터");
		count1 = new JLabel("카운터");
		ImageIcon icon = new ImageIcon("1.png");
		image = new JLabel(icon);
		time = new JLabel("시간");
		count.setFont(font);
		count1.setFont(font);
		time.setFont(font);
		add(count);
		add(count1);
		add(image);
		add(time);

		카운트스레드2 count2 = new 카운트스레드2();
		카운트스레드2 count3 = new 카운트스레드2();
		이미지스레드2 image2 = new 이미지스레드2();
		타이머스레드2 time2 = new 타이머스레드2();

		count2.start();
		count3.start();
		image2.start();
		time2.start();

		setVisible(true);
	}

	public class 이미지스레드2 extends Thread {

		@Override
		public void run() {
			String[] images = { "1.png", "2.png", "3.png", "4.png", "5.png", "1.png", "2.png", "3.png", "4.png",
					"5.png", "1.png", "2.png", "3.png", "4.png", "5.png", "1.png", "2.png", "3.png", "4.png", "5.png",
					"1.png", "2.png", "3.png", "4.png", "5.png" };
			for (int i = 0; i < images.length; i++) {
				image.setText("이미지 >> " + images[i]);
				try {
					Thread.sleep(5000);
				} catch (Exception e) {
					System.out.println("cpu 연결 문제 생김.");
				}
			}
		}
	}

	public class 타이머스레드2 extends Thread {

		@Override
		public void run() {
			for (int i = 1000; i > 0; i--) {
				Date date = new Date();
				time.setText("타이머 >> " + date);
				try {
					Thread.sleep(1000); // 1초재워라!
				} catch (Exception e) {
					System.out.println("cpu 연결 문제 생김.");
				}
			}
		}
	}

	// 내부클래스(inner class) ==> 전역변수 공유할 목적으로 사용(거의 쓰지 않는다)
	public class 카운트스레드2 extends Thread {

		@Override
		public void run() {
			for (int i = 0; i > 0; i--) {
				count.setText("추가요금 : " + (i*100) + "원");
				try {
					Thread.sleep(5000); // 2초재워라!
				} catch (Exception e) {
					System.out.println("cpu 연결 문제 생김.");
				}
			}
		}
	}
	public class 카운트스레드3 extends Thread {

		@Override
		public void run() {
			for (int i = 1000; i > 0; i--) {
				count1.setText("요금 : " +((i*100)+4800));
				try {
					Thread.sleep(5000); // 2초재워라!
				} catch (Exception e) {
					System.out.println("cpu 연결 문제 생김.");
				}
			}
		}
	}
}
