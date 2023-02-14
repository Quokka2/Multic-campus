package 부품응용하기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 로그인화면 {

	public static void main(String[] args) {
		// font, flowlayout
		// jframe, imageicon3개, imagelabel
		// idlabel, pwlabel, id입력값, pw입력값
		// 로그인버튼, reset버튼

		JFrame f = new JFrame();
		f.setTitle("내 일기장 로그인");
		f.setSize(240, 450);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("맑은고딕", 2, 15);

		JLabel top = new JLabel();
		JLabel id = new JLabel("아  이  디 : ");
		JLabel pw = new JLabel("패스워드 : ");
		id.setFont(font);
		pw.setFont(font);

		ImageIcon icon1 = new ImageIcon("1.png");
		ImageIcon icon2 = new ImageIcon("2.png");
		ImageIcon icon3 = new ImageIcon("3.png");
		top.setIcon(icon1);

		JTextField idText = new JTextField(10);
		JTextField pwText = new JTextField(10);
		idText.setFont(font);
		pwText.setFont(font);

		JButton login = new JButton();
		JButton reset = new JButton();
		login.setIcon(icon2);
		reset.setIcon(icon3);
		login.setBackground(Color.LIGHT_GRAY);
		reset.setBackground(Color.LIGHT_GRAY);

		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// reset을 눌렀을 때 idText, pwText에 공백을 넣어라.!
				idText.setText("");
				pwText.setText("");

			}
		});

		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String id2 = idText.getText();
				String pw2 = pwText.getText();
				if (id2.equals("root") && pw2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 성공");
					일기장쓰기 diary = new 일기장쓰기();
					diary.open();
					f.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(f, "로그인 실패");
				}
			}
		});

		f.add(top);
		f.add(id);
		f.add(idText);
		f.add(pw);
		f.add(pwText);
		f.add(login);
		f.add(reset);

		f.setVisible(true);

	}

}
