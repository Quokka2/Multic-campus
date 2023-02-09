package 로그인;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 로그인 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(230, 500);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		JLabel text1 = new JLabel();
		text1.setText("");
		JLabel text2 = new JLabel();
		text2.setText("아이디");
		JLabel text3 = new JLabel();
		text3.setText("패스워드");
		JLabel text4 = new JLabel();
		text4.setText("이름");
		JLabel text5 = new JLabel();
		text5.setText("전화번호");
		ImageIcon icon = new ImageIcon("1.png");
		text1.setIcon(icon);
		JButton b1 = new JButton();
		b1.setText("회원가입");
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		JTextField input3 = new JTextField(10);
		JTextField input4 = new JTextField(10);
		
		Font font = new Font("맑은고딕", 1, 20);
		
		text2.setFont(font);
		text3.setFont(font);
		text4.setFont(font);
		text5.setFont(font);
		input1.setFont(font);
		input2.setFont(font);
		input3.setFont(font);
		input4.setFont(font);
		b1.setFont(font);
		
		b1.setBackground(Color.green);
		
		f.add(text1);
		f.add(text2);
		f.add(input1);
		f.add(text3);
		f.add(input2);
		f.add(text4);
		f.add(input3);
		f.add(text5);
		f.add(input4);
		f.add(b1);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = input1.getText();
				String pw = input2.getText();
				String name = input3.getText();
				String hp = input4.getText();
				
				System.out.println("아이디 : " + id);
				System.out.println("패스워드 : " + pw);
				System.out.println("이름 : " + name);
				System.out.println("전화번호 : " + hp);
				System.out.println("회원가입 완료되었습니다.");
				
			}
		});
		
		
		f.setVisible(true);
	}

}
