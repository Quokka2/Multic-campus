package 주식정보시스템;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 네이버주식정보시스템 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 500);
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		f.setLayout(new FlowLayout());
		Font font = new Font("맑은고딕", Font.BOLD, 30);
		Font font1 = new Font("맑은고딕", Font.BOLD, 20);
		JButton b1 = new JButton("삼성전자");
		JButton b2 = new JButton("카카오");
		JButton b3 = new JButton("네이버");
		JButton b4 = new JButton("크롤링시작");
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		b4.setBackground(Color.BLACK);
		b4.setForeground(Color.WHITE);


		JLabel lable = new JLabel("CODE");
		lable.setFont(font1);

		JTextField text = new JTextField(10);
		text.setFont(font);

		JTextArea text1 = new JTextArea(5, 10);
		text1.setFont(font);

		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 삼성전자 005930
				text.setText("005930");
//				네이버증권크롤링4 c = new 네이버증권크롤링4();
//				c.naver(text.getText());
				
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 카카오 035720
				text.setText("035720");
//				네이버증권크롤링4 c = new 네이버증권크롤링4();
//				c.naver(text.getText());
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 네이버 035420
				text.setText("035420");
//				네이버증권크롤링4 c = new 네이버증권크롤링4();
//				c.naver(text.getText());
			}
		});
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String code = text.getText();
				네이버증권크롤링5 c = new 네이버증권크롤링5();
				String result = c.naver1(code);
				text1.setText(result);
			}
		});
		
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(lable);
		f.add(text);
		f.add(b4);
		f.getContentPane().add(text1);

		f.setVisible(true);
	}

}
