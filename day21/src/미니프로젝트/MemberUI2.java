package 미니프로젝트;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MemberUI2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("회원가입 화면");
		f.setSize(800, 1100);

		ImageIcon icon1 = new ImageIcon("1.png");
		ImageIcon icon2 = new ImageIcon("2.png");
		ImageIcon icon3 = new ImageIcon("3.png");
		ImageIcon icon4 = new ImageIcon("4.png");
		ImageIcon icon5 = new ImageIcon("5.png");
		ImageIcon icon6 = new ImageIcon("6.png");
		ImageIcon icon7 = new ImageIcon("7.png");
		ImageIcon icon8 = new ImageIcon("8.png");
		ImageIcon icon9 = new ImageIcon("9.png");

		JButton b1 = new JButton(); JButton c1 = new JButton("장바구니"); JButton a1 = new JButton("삭제");
		JButton b2 = new JButton(); JButton c2 = new JButton("장바구니"); JButton a2 = new JButton("삭제");
		JButton b3 = new JButton(); JButton c3 = new JButton("장바구니"); JButton a3 = new JButton("삭제");
		JButton b4 = new JButton(); JButton c4 = new JButton("장바구니"); JButton a4 = new JButton("삭제");
		JButton b5 = new JButton(); JButton c5 = new JButton("장바구니"); JButton a5 = new JButton("삭제");
		JButton b6 = new JButton(); JButton c6 = new JButton("장바구니"); JButton a6 = new JButton("삭제");
		JButton b7 = new JButton(); JButton c7 = new JButton("장바구니"); JButton a7 = new JButton("삭제");
		JButton b8 = new JButton(); JButton c8 = new JButton("장바구니"); JButton a8 = new JButton("삭제");
		JButton b9 = new JButton(); JButton c9 = new JButton("장바구니"); JButton a9 = new JButton("삭제");

		b1.setIcon(icon1);
		b2.setIcon(icon2);
		b3.setIcon(icon3);
		b4.setIcon(icon4);
		b5.setIcon(icon5);
		b6.setIcon(icon6);
		b7.setIcon(icon7);
		b8.setIcon(icon8);
		b9.setIcon(icon9);
		
		b1.setBounds(50, 50, 200, 200); c1.setBounds(50, 250, 100, 30); a1.setBounds(150, 250, 100, 30);
		b2.setBounds(300, 50, 200, 200); c2.setBounds(300, 250, 100, 30); a2.setBounds(400, 250, 100, 30);
		b3.setBounds(550, 50, 200, 200); c3.setBounds(550, 250, 100, 30); a3.setBounds(650, 250, 100, 30);
		
		b4.setBounds(50, 300, 200, 200); c4.setBounds(50, 500, 100, 30); a4.setBounds(150, 500, 100, 30);
		b5.setBounds(300, 300, 200, 200); c5.setBounds(300, 500, 100, 30); a5.setBounds(400, 500, 100, 30);
		b6.setBounds(550, 300, 200, 200); c6.setBounds(550, 500, 100, 30); a6.setBounds(650, 500, 100, 30);
		
		b7.setBounds(50, 550, 200, 200); c7.setBounds(50, 750, 100, 30); a7.setBounds(150, 750, 100, 30);
		b8.setBounds(300, 550, 200, 200); c8.setBounds(300, 750, 100, 30); a8.setBounds(400, 750, 100, 30);
		b9.setBounds(550, 550, 200, 200); c9.setBounds(550, 750, 100, 30); a9.setBounds(650, 750, 100, 30);
		
		c1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String code = "1";
				GoodsDAO dao = new GoodsDAO();
				GoodsVO2 bag2 = dao.one(code);
				String code2 = bag2.getCode();
				String name = bag2.getName();
				String price = bag2.getPrice();
				
				GoodsVO bag = new GoodsVO();
				bag.setCode(code2);
				bag.setName(name);
				bag.setPrice(price);

				try {
					int result = dao.insert(bag);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "장바구니에 담겼습니다.");
					} else {
						JOptionPane.showMessageDialog(f, "실패");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		a1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String code = "1";
				GoodsDAO dao = new GoodsDAO();
				GoodsVO bag = new GoodsVO();
				bag.setCode(code);
				try {
					int result = dao.delete(code);
					if (result >= 1) {
						JOptionPane.showMessageDialog(f, "삭제 성공");
					} else {
						JOptionPane.showMessageDialog(f, "삭제 실패");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		c2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String code = "2";
				GoodsDAO dao = new GoodsDAO();
				GoodsVO2 bag2 = dao.one(code);
				String code2 = bag2.getCode();
				String name = bag2.getName();
				String price = bag2.getPrice();
				
				GoodsVO bag = new GoodsVO();
				bag.setCode(code2);
				bag.setName(name);
				bag.setPrice(price);

				try {
					int result = dao.insert(bag);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "장바구니에 담겼습니다.");
					} else {
						JOptionPane.showMessageDialog(f, "실패");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		a2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String code = "2";
				GoodsDAO dao = new GoodsDAO();
				GoodsVO bag = new GoodsVO();
				bag.setCode(code);
				try {
					int result = dao.delete(code);
					if (result >= 1) {
						JOptionPane.showMessageDialog(f, "삭제 성공");
					} else {
						JOptionPane.showMessageDialog(f, "삭제 실패");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		Font font = new Font("맑은고딕", Font.BOLD, 15);


		a1.setFont(font); c1.setFont(font);
		a2.setFont(font); c2.setFont(font);
		a3.setFont(font); c3.setFont(font);
		a4.setFont(font); c4.setFont(font);
		a5.setFont(font); c5.setFont(font);
		a6.setFont(font); c6.setFont(font);
		a7.setFont(font); c7.setFont(font);
		a8.setFont(font); c8.setFont(font);
		a9.setFont(font); c9.setFont(font);
		
		f.add(b1); f.add(c1); f.add(a1);
		f.add(b2); f.add(c2); f.add(a2);
		f.add(b3); f.add(c3); f.add(a3);
		f.add(b4); f.add(c4); f.add(a4);
		f.add(b5); f.add(c5); f.add(a5);
		f.add(b6); f.add(c6); f.add(a6);
		f.add(b7); f.add(c7); f.add(a7);
		f.add(b8); f.add(c8); f.add(a8);
		f.add(b9); f.add(c9); f.add(a9);


		f.setLayout(null);
		f.getContentPane().setBackground(Color.WHITE);

		f.setVisible(true);
	}

}
