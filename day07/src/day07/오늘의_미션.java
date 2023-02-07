package day07;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 오늘의_미션 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(250, 700);
		// 이미지 삽입
		ImageIcon icon = new ImageIcon("aaaa.jpg");
		JLabel b2 = new JLabel();
		b2.setIcon(icon);
		//첫번째 문구
		JLabel text1 = new JLabel();
		text1.setText("숫자1");
		//입력란1
		JTextField input1 = new JTextField(10);
		//두번째 문구
		JLabel text2 = new JLabel();
		text2.setText("숫자2");
		//입력란2
		JTextField input2 = new JTextField(10);
		//더하기 버튼
		JButton b1 = new JButton();
		b1.setText("+");
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		//글자 속성
		Font font = new Font("맑은 고딕", 1, 20);
		text1.setFont(font);
		input1.setFont(font);
		b1.setFont(font);
		text2.setFont(font);
		input2.setFont(font);
		//배경색
		input1.setBackground(Color.yellow);
		input2.setBackground(Color.yellow);
		b1.setBackground(Color.blue);
		b2.setForeground(Color.red);
		
		//출력하려는 객체들
		f.add(b2);
		f.add(text1);
		f.add(input1);
		f.add(text2);
		f.add(input2);
		f.add(b1);
		
		//화면틀을 출력하는 제일 마지막에 들어가야함
		f.setVisible(true);
	}

}
