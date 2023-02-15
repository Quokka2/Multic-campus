package 생성자맛보기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 로또번호생성기 {
	static int a1;
	static int a2;
	static int a3;
	static int a4;
	static int a5;
	static int a6;
	static int b1;
	static int b2;
	static int b3;
	static int b4;
	static int b5;
	static int b6;
	static String result1;
	static String result2;



	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(350, 500);
		f.getContentPane().setBackground(Color.green);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("맑은고딕", 3, 40);

		JButton b1 = new JButton("자동");
		JButton b2 = new JButton("당첨번호");
		b1.setFont(font);
		b2.setFont(font);

		JLabel result1 = new JLabel("번호 : ");
		JLabel result2 = new JLabel("번호 : ");
		JLabel result3 = new JLabel("당첨여부");
		result1.setFont(font);
		result2.setFont(font);
		result3.setFont(font);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Random r1 = new Random();
				int a1 = r1.nextInt(6)+1;
				int a2 = r1.nextInt(6)+1;
				int a3 = r1.nextInt(6)+1;
				int a4 = r1.nextInt(6)+1;
				int a5 = r1.nextInt(6)+1;
				int a6 = r1.nextInt(6)+1;
				result1.setText("번호 : " + a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5 + " " + a6);
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Random r2 = new Random();
				int b1 = r2.nextInt(6)+1;
				int b2 = r2.nextInt(6)+1;
				int b3 = r2.nextInt(6)+1;
				int b4 = r2.nextInt(6)+1;
				int b5 = r2.nextInt(6)+1;
				int b6 = r2.nextInt(6)+1;
				result2.setText("번호 : " + b1 + " " + b2 + " " + b3 + " " + b4 + " " + b5 + " " + b6);
			}
		});
		

		f.add(b1);
		f.add(result1);
		f.add(b2);
		f.add(result2);
		f.add(result3);

		f.setVisible(true);
	}

}
