package 메서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 나의영화앨범 {

	static int index = 2;

	public static void main(String[] args) {
		String[] title = { "더 퍼스트 슬램덩크", "타이타닉", "아바타2", "교섭", "바빌론" };
		String[] img = { "1.png", "2.png", "3.png", "4.png", "5.png" };
		double[] jumsu = { 9.28, 9.72, 8.82, 6.62, 8.85 };

		JFrame f = new JFrame();
		f.setSize(330, 380);
		f.getContentPane().setBackground(Color.GREEN);
		
		

		Font font = new Font("맑은고딕", 2, 20);
		// 객체생성를 하는데, 특정한 입력값을 넣지 않으면 못만들게 할 수 있음
		JLabel top = new JLabel(title[0]);
		top.setFont(font);
		top.setHorizontalAlignment(0);
		f.add(top, BorderLayout.NORTH);

		JLabel center = new JLabel("");
		ImageIcon icon = new ImageIcon(img[0]);
		center.setFont(font);
		center.setIcon(icon);
		f.add(center, BorderLayout.CENTER);
		
		// String.valueOf() : int, double, .... => String으로 변환
		// int + ""
		// Integer.parse() : double, String, .... => int으로 변환
		// Double.parse() : int, String, .... => double으로 변환
		JLabel under = new JLabel(String.valueOf(jumsu[0]));
		under.setFont(font);
		under.setHorizontalAlignment(0);
		f.add(under, BorderLayout.SOUTH);

		JButton west = new JButton("<<");
		west.setFont(font);
		f.add(west, BorderLayout.WEST);

		// 액션처리 하는 방법
		// 1)액션기능을 add
		// 2)클릭액션이 있을 때 처리할 부품을 만들어주세요.
		// 3)클릭액션이 있을 때 어떻게 처리할지 내용을 코딩해주세요.

		west.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 현재 인덱스보다 하나 적은 값들로 top, center, under를 setting
				top.setText(title[index - 1]);
				under.setText(jumsu[index - 1] + "");
				index--;
			}
		});

		JButton east = new JButton(">>");
		east.setFont(font);
		f.add(east, BorderLayout.EAST);

		east.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				top.setText(title[index + 1]);
				under.setText(jumsu[index + 1] + "");
				index++;
			}
		});

		// 프로그램 끝나면 자동으로 exit
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);
	}

}
