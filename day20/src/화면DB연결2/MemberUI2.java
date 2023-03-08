package 화면DB연결2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import 자바DB연결2.MemberDAO3;

public class MemberUI2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("회원가입 화면");
		f.setSize(300, 700);

		JLabel l1 = new JLabel("<<< 회원가입화면 >>>");
		JLabel l2 = new JLabel("ID");
		JLabel l3 = new JLabel("PW");
		JLabel l4 = new JLabel("NAME");
		JLabel l5 = new JLabel("TEL");

		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);

		JButton b1 = new JButton("회원가입 처리");
		JButton b2 = new JButton("회원탈퇴 처리");
		JButton b3 = new JButton("회원수정 처리");
		JButton b4 = new JButton("회원검색 처리");

		FlowLayout flow = new FlowLayout();

		Font font = new Font("맑은고딕", Font.BOLD, 30);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				if (id.equals("")) {
					JOptionPane.showConfirmDialog(f, "ID는 필수입력항목입니다.");
				}

				MemberDAO3 dao = new MemberDAO3();
				MemberVO bag = new MemberVO();
				bag.setId(id);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);
				try {
					int result = dao.insert(bag);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "회원가입 성공");
					} else {
						JOptionPane.showMessageDialog(f, "회원가입 실패");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원탈퇴처리");
				String id = t1.getText();

				MemberDAO3 dao = new MemberDAO3();
				try {
					int result = dao.delete(id);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "회원탈퇴 성공");
					} else {
						JOptionPane.showMessageDialog(f, "회원탈퇴 실패, 재입력해주세요.");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String tel = t4.getText();

				MemberDAO3 dao = new MemberDAO3();
				MemberVO bag = new MemberVO();
				bag.setId(id);
				bag.setTel(tel);

				try {
					int result = dao.update(bag);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "회원수정 성공");
					} else {
						JOptionPane.showMessageDialog(f, "회원수정 실패, 재입력해주세요.");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

		f.setLayout(flow);
		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(l3);
		f.add(t2);
		f.add(l4);
		f.add(t3);
		f.add(l5);
		f.add(t4);
		l1.setFont(font);
		t1.setFont(font);
		l2.setFont(font);
		t2.setFont(font);
		l3.setFont(font);
		t3.setFont(font);
		l4.setFont(font);
		t4.setFont(font);
		l5.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		f.getContentPane().setBackground(Color.WHITE);
		t1.setBackground(Color.BLUE);
		t1.setForeground(Color.WHITE);
		t2.setBackground(Color.BLUE);
		t2.setForeground(Color.WHITE);
		t3.setBackground(Color.BLUE);
		t3.setForeground(Color.WHITE);
		t4.setBackground(Color.BLUE);
		t4.setForeground(Color.WHITE);

		b1.setBackground(Color.BLUE);
		b1.setForeground(Color.WHITE);
		b2.setBackground(Color.BLUE);
		b2.setForeground(Color.WHITE);
		b3.setBackground(Color.BLUE);
		b3.setForeground(Color.WHITE);
		b4.setBackground(Color.BLUE);
		b4.setForeground(Color.WHITE);

		f.setVisible(true);
	}

}
