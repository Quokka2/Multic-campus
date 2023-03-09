package 수업;

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

public class BbsUI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 게시판 화면");
		f.setSize(710, 500);

		JLabel l1 = new JLabel("<<<< 게시판 글쓰기 화면 >>>>");
		JLabel l2 = new JLabel("게시판 번호");
		JLabel l3 = new JLabel("게시판 제목");
		JLabel l4 = new JLabel("게시판 내용");
		JLabel l5 = new JLabel("게시판 글쓴이");

		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);

		JButton b1 = new JButton("게시판 글쓰기 처리");
		JButton b2 = new JButton("게시판 지우기 처리");
		JButton b3 = new JButton("게시판 수 정 처리");
		JButton b4 = new JButton("게시판 검 색 처리");

		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원검색처리");
				String no = t1.getText();
				int no2 = Integer.parseInt(no);

				BbsDAO dao = new BbsDAO();
				BbsVO bag = dao.one(no2);
				if (bag != null) {
					t2.setText(bag.getTitle());
					t3.setText(bag.getContent());
					t4.setText(bag.getWriter());
					t2.setBackground(Color.pink);
					t3.setBackground(Color.pink);
					t4.setBackground(Color.pink);
				} else {
					t2.setText("");
					t3.setText("");
					t4.setText("");
					JOptionPane.showMessageDialog(f, "검색결과 없음");
				}
			}// action
		}); // b4

		FlowLayout flow = new FlowLayout();

		Font font = new Font("궁서", Font.BOLD, 40);

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
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		t1.setBackground(Color.yellow);
		t1.setForeground(Color.red);
		t2.setBackground(Color.yellow);
		t2.setForeground(Color.red);
		t3.setBackground(Color.yellow);
		t3.setForeground(Color.red);
		t4.setBackground(Color.yellow);
		t4.setForeground(Color.red);

		b1.setBackground(Color.pink); // 배경색
		b1.setForeground(Color.blue); // 글자색
		b2.setBackground(Color.pink);
		b2.setForeground(Color.blue);
		b3.setBackground(Color.pink);
		b3.setForeground(Color.blue);
		b4.setBackground(Color.pink);
		b4.setForeground(Color.blue);

		f.getContentPane().setBackground(Color.pink);
		// 맨 끝으로~~~~~
		f.setVisible(true);

	}

}