package static1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 오늘의문제 {
	static int count;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(450, 400);
		f.getContentPane().setBackground(Color.LIGHT_GRAY);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("맑은고딕", 1, 20);
		Font font1 = new Font("맑은고딕", 5, 200);

		JButton b1 = new JButton("1 더하기");
		JButton b2 = new JButton("0으로 초기화");
		JButton b3 = new JButton("1 빼기");
		b1.setFont(font);
		b1.setBackground(Color.green);
		b2.setFont(font);
		b2.setForeground(Color.white);
		b2.setBackground(Color.blue);
		b3.setFont(font);
		b3.setBackground(Color.green);

		JLabel result1 = new JLabel();
		result1.setFont(font1);
		result1.setForeground(Color.red);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				result1.setText(count + "");
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0;
				result1.setText(count+"");

			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count--;
				result1.setText(count + "");
			}
		});

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(result1);

		f.setVisible(true);
	}

}