package 제어문문제;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 인기투표시스템3 {
	public static void main(String[] args) {
		// 1. 팝업창 생성
		JFrame f = new JFrame();
		f.setSize(400, 1000);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		// 2. 버튼만들기
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		b1.setText("");
		b2.setText("");
		b3.setText("");
		// 3. 라벨(텍스트 나오는 상자라고 생각하면 편함)만들기
		JLabel text1 = new JLabel();
		JLabel text2 = new JLabel();
		JLabel text3 = new JLabel();
		JLabel text4 = new JLabel();
		JLabel text5 = new JLabel();
		JLabel text6 = new JLabel();
		JLabel text7 = new JLabel();
		text1.setText("K-pop 인기투표");
		text2.setText("1. 아이유");
		text3.setText("2. BTS");
		text4.setText("3. 뉴진스");
		text5.setText("");
		text6.setText("");
		text7.setText("");
		// 4. 폰트 정하기
		Font font = new Font("맑은고딕", 1, 20);
		// 5. 폰트 적용될 변수들 지정
		text1.setFont(font);
		b1.setFont(font);
		text2.setFont(font);
		text3.setFont(font);
		text4.setFont(font);
		text5.setFont(font);
		text6.setFont(font);
		text7.setFont(font);
		// 5. 이미지 삽입
		ImageIcon icon1 = new ImageIcon("11.png");
		ImageIcon icon2 = new ImageIcon("22.jpg");
		ImageIcon icon3 = new ImageIcon("33.png");
		// 6. 어디에 넣을지 정하기
		b1.setIcon(icon1);
		b2.setIcon(icon2);
		b3.setIcon(icon3);
		// 7. 팝업창에 표시할 놈들
		f.add(text1);
		f.add(b1);
		f.add(text2);
		f.add(text5);
		f.add(b2);
		f.add(text3);
		f.add(text6);
		f.add(b3);
		f.add(text4);
		f.add(text7);
		// 액션을 취했을때 동작할 코드 삽입
		b1.addActionListener(new ActionListener() {
			int i = 0;

			@Override
			public void actionPerformed(ActionEvent e) {

				i++;
				text5.setText(i + "표");
			}
		});
		b2.addActionListener(new ActionListener() {
			int i = 0;

			@Override
			public void actionPerformed(ActionEvent e) {

				i++;
				text6.setText(i + "표");
			}
		});
		b3.addActionListener(new ActionListener() {
			int i = 0;

			@Override
			public void actionPerformed(ActionEvent e) {

				i++;
				text7.setText(i + "표");
			}
		});

		f.setVisible(true);
	}
}