package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품조립하기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(200, 300);
		
		JLabel l = new JLabel();
		l.setText("당신이 생각한 숫자를 입력하세요.");
		
		JTextField text = new JTextField(10);
		
		JButton b = new JButton();
		b.setText("Number Game");
		
		FlowLayout flow = new FlowLayout();
		Font font = new Font("맑은 고딕", 1, 10);
		
		f.getContentPane().setBackground(Color.green);
		f.setLayout(flow);
		f.add(l);
		f.add(text);
		f.add(b);
		l.setFont(font);
		
		f.setVisible(true);
	}

}
