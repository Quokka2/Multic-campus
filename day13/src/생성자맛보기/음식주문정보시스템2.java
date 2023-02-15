package 생성자맛보기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 음식주문정보시스템2 {

	static int count; // 0으로 초기화, 전역변수!
	static int count1; // 0으로 초기화, 전역변수!
	static int count2; // 0으로 초기화, 전역변수!
	static int count3; // 0으로 초기화, 전역변수!
	final static int PRICE1 = 8000;// final은 변경불가, 상수
	final static int PRICE2 = 10000;// final은 변경불가, 상수
	final static int PRICE3 = 20000;// final은 변경불가, 상수
	// 상수변수를 쓸 때는 잘보이라고 변수명을 모두 대문자로!를 권장!!!

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setBackground(Color.green);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton b1 = new JButton("짜장");
		JButton b2 = new JButton("짬뽕");
		JButton b3 = new JButton("유린기");
		Font font = new Font("맑은고딕", 2, 20);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b1.setBackground(Color.LIGHT_GRAY);
		b2.setBackground(Color.LIGHT_GRAY);
		b3.setBackground(Color.LIGHT_GRAY);

		JLabel textLabel = new JLabel("개수: ");
		textLabel.setFont(font);
		JLabel countLabel = new JLabel("0개");
		countLabel.setFont(font);
		JLabel imgLabel = new JLabel();
		ImageIcon icon = new ImageIcon("짜장.png");
		imgLabel.setIcon(icon);
		JLabel result = new JLabel("결제금액 0원");
		result.setFont(font);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("짜장.png");
				imgLabel.setIcon(icon);
				count++;
				count1++;
				countLabel.setText(count + "개");
				result.setText("결제금액 : " + ((count1 * PRICE1) + (count2 * PRICE2) + (count3 * PRICE3)) + "원");
				f.setTitle("짜장 : " + count1 + "개 " + "짬뽕 : " + count2 + "개 " + "유린기 : " + count3 + "개");
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("짬뽕.png");
				imgLabel.setIcon(icon);
				count++;
				count2++;
				countLabel.setText(count + "개");
				result.setText("결제금액 : " + ((count1 * PRICE1) + (count2 * PRICE2) + (count3 * PRICE3)) + "원");
				f.setTitle("짜장 : " + count1 + "개 " + "짬뽕 : " + count2 + "개 " + "유린기 : " + count3 + "개");
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("유린기.png");
				imgLabel.setIcon(icon);
				count++;
				count3++;
				countLabel.setText(count + "개");
				result.setText("결제금액 : " + ((count1 * PRICE1) + (count2 * PRICE2) + (count3 * PRICE3)) + "원");
				f.setTitle("짜장 : " + count1 + "개 " + "짬뽕 : " + count2 + "개 " + "유린기 : " + count3 + "개");
			}
		});

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(textLabel);
		f.add(countLabel);
		f.add(imgLabel);
		f.add(result);

		f.setVisible(true);
	}

}