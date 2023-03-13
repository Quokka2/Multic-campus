package 미니프로젝트;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class ProUI2{

	private static JTable table;
	// 2번 Frame만 따로 메서드 만들어서 실행시킨 코드
	// 이렇게 구현해도 동시에 종료되는 현상을 해결가능
	public ProUI2() {
		JFrame f1 = new JFrame();
		f1.setTitle("My Frame");
        f1.setSize(600, 600);
		JPanel p = new JPanel();
		

		String header[] = { "CODE", "NAME", "COST", "SORT", "ID" };
		ProDAO dao = new ProDAO();
		ArrayList<ProVO> list = dao.list();

		Object[][] all = new Object[list.size()][5];
		for (int i = 0; i < all.length; i++) {
			all[i][0] = list.get(i).getCode();
			all[i][1] = list.get(i).getName();
			all[i][2] = list.get(i).getCost();
			all[i][3] = list.get(i).getSort();
			all[i][4] = list.get(i).getId();
		}
		table = new JTable(all, header);
		JScrollPane scrollPane = new JScrollPane(table);
		table.setShowGrid(true);
		table.setGridColor (Color.BLACK); table.setBackground (Color.WHITE); table.setForeground(Color.BLACK);
		table.setRowHeight(table.getRowHeight() + 8);
		
		TableModel model = table.getModel(); // JTable의 데이터 모델인 TableModel을 가져옵니다.
		int sumColumnIndex = 2; // 합계를 계산할 열의 인덱스를 찾습니다
		// 모델의 모든 행을 반복하며 해당 열의 데이터를 가져와서 합계를 계산합니다.
		double sum = 0;
		for (int i = 0; i < model.getRowCount(); i++) {
		    double value = Double.parseDouble(model.getValueAt(i, sumColumnIndex).toString());
		    sum += value;
		} // 계산된 합계를 사용하여 필요한 작업을 수행합니다.
		JLabel l1 = new JLabel("원");
		JLabel l2 = new JLabel("결제금액 : " + (int)sum);
		Font font1 = new Font("맑은고딕", Font.BOLD, 30);
		p.repaint();
		p.updateUI();
		p.add(scrollPane);
		f1.add(l1);
		f1.add(l2);
		l1.setBounds(530, 450, 150, 30); l1.setFont(font1); l1.setForeground(Color.RED);
		l2.setBounds(270, 450, 500, 30); l2.setFont(font1); l2.setForeground(Color.RED);

		f1.getContentPane().add(p, BorderLayout.CENTER);
		f1.setVisible(true);
	}
	
	

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("주문하기");
		f.setSize(800, 1000);


		// 이미지 객체
		ImageIcon icon1 = new ImageIcon("1.png");
		ImageIcon icon2 = new ImageIcon("2.png");
		ImageIcon icon3 = new ImageIcon("3.png");
		ImageIcon icon4 = new ImageIcon("4.png");
		ImageIcon icon5 = new ImageIcon("5.png");
		ImageIcon icon6 = new ImageIcon("6.png");
		ImageIcon icon7 = new ImageIcon("7.png");
		ImageIcon icon8 = new ImageIcon("8.png");
		ImageIcon icon9 = new ImageIcon("9.png");
		// 버튼 객체
		JButton b1 = new JButton(); JButton c1 = new JButton("장바구니"); JButton a1 = new JButton("삭제");
		JButton b2 = new JButton(); JButton c2 = new JButton("장바구니"); JButton a2 = new JButton("삭제");
		JButton b3 = new JButton(); JButton c3 = new JButton("장바구니"); JButton a3 = new JButton("삭제");
		JButton b4 = new JButton(); JButton c4 = new JButton("장바구니"); JButton a4 = new JButton("삭제");
		JButton b5 = new JButton(); JButton c5 = new JButton("장바구니"); JButton a5 = new JButton("삭제");
		JButton b6 = new JButton(); JButton c6 = new JButton("장바구니"); JButton a6 = new JButton("삭제");
		JButton b7 = new JButton(); JButton c7 = new JButton("장바구니"); JButton a7 = new JButton("삭제");
		JButton b8 = new JButton(); JButton c8 = new JButton("장바구니"); JButton a8 = new JButton("삭제");
		JButton b9 = new JButton(); JButton c9 = new JButton("장바구니"); JButton a9 = new JButton("삭제");
		JButton b10 = new JButton("장바구니 바로가기");
		// 이미지 구현
		b1.setIcon(icon1);
		b2.setIcon(icon2);
		b3.setIcon(icon3);
		b4.setIcon(icon4);
		b5.setIcon(icon5);
		b6.setIcon(icon6);
		b7.setIcon(icon7);
		b8.setIcon(icon8);
		b9.setIcon(icon9);
		// 버튼 위치 지정 setBounds(가로위치, 세로위치, 버튼 가로크기, 버튼 세로크기)
		b1.setBounds(50, 50, 200, 200); c1.setBounds(50, 250, 100, 30); a1.setBounds(150, 250, 100, 30);
		b2.setBounds(300, 50, 200, 200); c2.setBounds(300, 250, 100, 30); a2.setBounds(400, 250, 100, 30);
		b3.setBounds(550, 50, 200, 200); c3.setBounds(550, 250, 100, 30); a3.setBounds(650, 250, 100, 30);
		
		b4.setBounds(50, 300, 200, 200); c4.setBounds(50, 500, 100, 30); a4.setBounds(150, 500, 100, 30);
		b5.setBounds(300, 300, 200, 200); c5.setBounds(300, 500, 100, 30); a5.setBounds(400, 500, 100, 30);
		b6.setBounds(550, 300, 200, 200); c6.setBounds(550, 500, 100, 30); a6.setBounds(650, 500, 100, 30);
		
		b7.setBounds(50, 550, 200, 200); c7.setBounds(50, 750, 100, 30); a7.setBounds(150, 750, 100, 30);
		b8.setBounds(300, 550, 200, 200); c8.setBounds(300, 750, 100, 30); a8.setBounds(400, 750, 100, 30);
		b9.setBounds(550, 550, 200, 200); c9.setBounds(550, 750, 100, 30); a9.setBounds(650, 750, 100, 30);
		b10.setBounds(350, 820, 400, 50);
		//버튼 액션입력
		c1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int code = 1; // bag에 넣을 변수
				String id = "a";
				ProDAO dao = new ProDAO(); // DAO객체 생성
				ProVO2 bag2 = dao.one(code); // bag2에 DAO에서 실행된 one메서드의 return값 입력
				ProVO3 bag3 = dao.one1(id); // bag3에 DAO에서 실행된 one1메서드의 return값 입력
				int code2 = bag2.getCode(); // bag2에 들어있는 데이터 중 code값 가져오기
				String name = bag2.getName();
				String cost = bag2.getCost();
				String sort = bag2.getSort();
				String id2 = bag3.getId(); // bag3에 들어있는 데이터 중 id값 가져오기
				// id와 code의 데이터가 있는 테이블이 다르기 때문에 가방을 2개 생성해서 각각 테이블의 데이터를 불러왔음.
				ProVO bag = new ProVO(); // bag객체 생성
				//bag에 bag2,3의 원하는 데이터 입력
				bag.setCode(code2); 
				bag.setName(name);
				bag.setCost(cost);
				bag.setSort(sort);
				bag.setId(id2);
				try {
					int result = dao.insert(bag); // DAO insert메서드에 가방 전달 후 return값 반환
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

				int code = 1;
				String id = "a";
				ProDAO dao = new ProDAO();
				ProVO bag = new ProVO();
				bag.setCode(code);
				bag.setId(id);
				try {
					int result = dao.delete(bag);
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
				int code = 2;
				String id = "a";
				ProDAO dao = new ProDAO();
				ProVO2 bag2 = dao.one(code);
				ProVO3 bag3 = dao.one1(id);
				int code2 = bag2.getCode();
				String name = bag2.getName();
				String cost = bag2.getCost();
				String sort = bag2.getSort();
				String id2 = bag3.getId();

				ProVO bag = new ProVO();
				bag.setCode(code2);
				bag.setName(name);
				bag.setCost(cost);
				bag.setSort(sort);
				bag.setId(id2);
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

				int code = 2;
				String id = "a";
				ProDAO dao = new ProDAO();
				ProVO bag = new ProVO();
				bag.setCode(code);
				bag.setId(id);
				try {
					int result = dao.delete(bag);
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
		c3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int code = 3;
				String id = "a";
				ProDAO dao = new ProDAO();
				ProVO2 bag2 = dao.one(code);
				ProVO3 bag3 = dao.one1(id);
				int code2 = bag2.getCode();
				String name = bag2.getName();
				String cost = bag2.getCost();
				String sort = bag2.getSort();
				String id2 = bag3.getId();

				ProVO bag = new ProVO();
				bag.setCode(code2);
				bag.setName(name);
				bag.setCost(cost);
				bag.setSort(sort);
				bag.setId(id2);
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
		a3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int code = 3;
				String id = "a";
				ProDAO dao = new ProDAO();
				ProVO bag = new ProVO();
				bag.setCode(code);
				bag.setId(id);
				try {
					int result = dao.delete(bag);
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
		c4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int code = 4;
				String id = "a";
				ProDAO dao = new ProDAO();
				ProVO2 bag2 = dao.one(code);
				ProVO3 bag3 = dao.one1(id);
				int code2 = bag2.getCode();
				String name = bag2.getName();
				String cost = bag2.getCost();
				String sort = bag2.getSort();
				String id2 = bag3.getId();

				ProVO bag = new ProVO();
				bag.setCode(code2);
				bag.setName(name);
				bag.setCost(cost);
				bag.setSort(sort);
				bag.setId(id2);
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
		a4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int code = 4;
				String id = "a";
				ProDAO dao = new ProDAO();
				ProVO bag = new ProVO();
				bag.setCode(code);
				bag.setId(id);
				try {
					int result = dao.delete(bag);
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
		c5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int code = 5;
				String id = "a";
				ProDAO dao = new ProDAO();
				ProVO2 bag2 = dao.one(code);
				ProVO3 bag3 = dao.one1(id);
				int code2 = bag2.getCode();
				String name = bag2.getName();
				String cost = bag2.getCost();
				String sort = bag2.getSort();
				String id2 = bag3.getId();

				ProVO bag = new ProVO();
				bag.setCode(code2);
				bag.setName(name);
				bag.setCost(cost);
				bag.setSort(sort);
				bag.setId(id2);
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
		a5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int code = 5;
				String id = "a";
				ProDAO dao = new ProDAO();
				ProVO bag = new ProVO();
				bag.setCode(code);
				bag.setId(id);
				try {
					int result = dao.delete(bag);
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
		c6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int code = 6;
				String id = "a";
				ProDAO dao = new ProDAO();
				ProVO2 bag2 = dao.one(code);
				ProVO3 bag3 = dao.one1(id);
				int code2 = bag2.getCode();
				String name = bag2.getName();
				String cost = bag2.getCost();
				String sort = bag2.getSort();
				String id2 = bag3.getId();

				ProVO bag = new ProVO();
				bag.setCode(code2);
				bag.setName(name);
				bag.setCost(cost);
				bag.setSort(sort);
				bag.setId(id2);
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
		a6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int code = 6;
				String id = "a";
				ProDAO dao = new ProDAO();
				ProVO bag = new ProVO();
				bag.setCode(code);
				bag.setId(id);
				try {
					int result = dao.delete(bag);
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
		c7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int code = 7;
				String id = "a";
				ProDAO dao = new ProDAO();
				ProVO2 bag2 = dao.one(code);
				ProVO3 bag3 = dao.one1(id);
				int code2 = bag2.getCode();
				String name = bag2.getName();
				String cost = bag2.getCost();
				String sort = bag2.getSort();
				String id2 = bag3.getId();

				ProVO bag = new ProVO();
				bag.setCode(code2);
				bag.setName(name);
				bag.setCost(cost);
				bag.setSort(sort);
				bag.setId(id2);
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
		a7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int code = 7;
				String id = "a";
				ProDAO dao = new ProDAO();
				ProVO bag = new ProVO();
				bag.setCode(code);
				bag.setId(id);
				try {
					int result = dao.delete(bag);
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
		c8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int code = 8;
				String id = "a";
				ProDAO dao = new ProDAO();
				ProVO2 bag2 = dao.one(code);
				ProVO3 bag3 = dao.one1(id);
				int code2 = bag2.getCode();
				String name = bag2.getName();
				String cost = bag2.getCost();
				String sort = bag2.getSort();
				String id2 = bag3.getId();

				ProVO bag = new ProVO();
				bag.setCode(code2);
				bag.setName(name);
				bag.setCost(cost);
				bag.setSort(sort);
				bag.setId(id2);
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
		a8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int code = 8;
				String id = "a";
				ProDAO dao = new ProDAO();
				ProVO bag = new ProVO();
				bag.setCode(code);
				bag.setId(id);
				try {
					int result = dao.delete(bag);
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
		c9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int code = 9;
				String id = "a";
				ProDAO dao = new ProDAO();
				ProVO2 bag2 = dao.one(code);
				ProVO3 bag3 = dao.one1(id);
				int code2 = bag2.getCode();
				String name = bag2.getName();
				String cost = bag2.getCost();
				String sort = bag2.getSort();
				String id2 = bag3.getId();

				ProVO bag = new ProVO();
				bag.setCode(code2);
				bag.setName(name);
				bag.setCost(cost);
				bag.setSort(sort);
				bag.setId(id2);
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
		a9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int code = 9;
				String id = "a";
				ProDAO dao = new ProDAO();
				ProVO bag = new ProVO();
				bag.setCode(code);
				bag.setId(id);
				try {
					int result = dao.delete(bag);
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
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int code = 1; // 불러오려는 매게변수 지정
				ProDAO dao = new ProDAO(); // DAO객체 생성
				ProVO2 bag2 = dao.one(code); // bag2에 DAO에서 실행한 one메소드 저장
				String name = bag2.getName(); // name에 bag2에 저장된 name데이터 집어넣기
				String cost = bag2.getCost();
				String sort = bag2.getSort();
				
				ProVO bag = new ProVO(); // bag객체 생성
				bag.setCode(code); // bag에 bag2에서 가져온 데이터 다시 집어넣기
				bag.setName(name);
				bag.setCost(cost);
				bag.setSort(sort);
				
				int a = bag.getCode(); // bag에 저장된 데이터 불러오기
				String b = bag.getName();
				String c = bag.getCost();
				String d = bag.getSort();
				JOptionPane.showMessageDialog(f, "제품코드 : "+ a +"\n제품 : "+ b +"\n가격 : "+ c +"원"+"\n품목 : " +d); // \n은 줄바꾸기
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int code = 2;
				ProDAO dao = new ProDAO();
				ProVO2 bag2 = dao.one(code);
				String name = bag2.getName();
				String cost = bag2.getCost();
				String sort = bag2.getSort();
				
				ProVO bag = new ProVO();
				bag.setCode(code);
				bag.setName(name);
				bag.setCost(cost);
				bag.setSort(sort);
				
				int a = bag.getCode();
				String b = bag.getName();
				String c = bag.getCost();
				String d = bag.getSort();
				JOptionPane.showMessageDialog(f, "제품코드 : "+ a +"\n제품 : "+ b +"\n가격 : "+ c +"원"+"\n품목 : " +d);
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int code = 3;
				ProDAO dao = new ProDAO();
				ProVO2 bag2 = dao.one(code);
				String name = bag2.getName();
				String cost = bag2.getCost();
				String sort = bag2.getSort();
				
				ProVO bag = new ProVO();
				bag.setCode(code);
				bag.setName(name);
				bag.setCost(cost);
				bag.setSort(sort);
				
				int a = bag.getCode();
				String b = bag.getName();
				String c = bag.getCost();
				String d = bag.getSort();
				JOptionPane.showMessageDialog(f, "제품코드 : "+ a +"\n제품 : "+ b +"\n가격 : "+ c +"원"+"\n품목 : " +d);
			}
		});
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int code = 4;
				ProDAO dao = new ProDAO();
				ProVO2 bag2 = dao.one(code);
				String name = bag2.getName();
				String cost = bag2.getCost();
				String sort = bag2.getSort();
				
				ProVO bag = new ProVO();
				bag.setCode(code);
				bag.setName(name);
				bag.setCost(cost);
				bag.setSort(sort);
				
				int a = bag.getCode();
				String b = bag.getName();
				String c = bag.getCost();
				String d = bag.getSort();
				JOptionPane.showMessageDialog(f, "제품코드 : "+ a +"\n제품 : "+ b +"\n가격 : "+ c +"원"+"\n품목 : " +d);
			}
		});
		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int code = 5;
				ProDAO dao = new ProDAO();
				ProVO2 bag2 = dao.one(code);
				String name = bag2.getName();
				String cost = bag2.getCost();
				String sort = bag2.getSort();
				
				ProVO bag = new ProVO();
				bag.setCode(code);
				bag.setName(name);
				bag.setCost(cost);
				bag.setSort(sort);
				
				int a = bag.getCode();
				String b = bag.getName();
				String c = bag.getCost();
				String d = bag.getSort();
				JOptionPane.showMessageDialog(f, "제품코드 : "+ a +"\n제품 : "+ b +"\n가격 : "+ c +"원"+"\n품목 : " +d);
			}
		});
		b6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int code = 6;
				ProDAO dao = new ProDAO();
				ProVO2 bag2 = dao.one(code);
				String name = bag2.getName();
				String cost = bag2.getCost();
				String sort = bag2.getSort();
				
				ProVO bag = new ProVO();
				bag.setCode(code);
				bag.setName(name);
				bag.setCost(cost);
				bag.setSort(sort);
				
				int a = bag.getCode();
				String b = bag.getName();
				String c = bag.getCost();
				String d = bag.getSort();
				JOptionPane.showMessageDialog(f, "제품코드 : "+ a +"\n제품 : "+ b +"\n가격 : "+ c +"원"+"\n품목 : " +d);
			}
		});
		b7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int code = 7;
				ProDAO dao = new ProDAO();
				ProVO2 bag2 = dao.one(code);
				String name = bag2.getName();
				String cost = bag2.getCost();
				String sort = bag2.getSort();
				
				ProVO bag = new ProVO();
				bag.setCode(code);
				bag.setName(name);
				bag.setCost(cost);
				bag.setSort(sort);
				
				int a = bag.getCode();
				String b = bag.getName();
				String c = bag.getCost();
				String d = bag.getSort();
				JOptionPane.showMessageDialog(f, "제품코드 : "+ a +"\n제품 : "+ b +"\n가격 : "+ c +"원"+"\n품목 : " +d);
			}
		});
		b8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int code = 8;
				ProDAO dao = new ProDAO();
				ProVO2 bag2 = dao.one(code);
				String name = bag2.getName();
				String cost = bag2.getCost();
				String sort = bag2.getSort();
				
				ProVO bag = new ProVO();
				bag.setCode(code);
				bag.setName(name);
				bag.setCost(cost);
				bag.setSort(sort);
				
				int a = bag.getCode();
				String b = bag.getName();
				String c = bag.getCost();
				String d = bag.getSort();
				JOptionPane.showMessageDialog(f, "제품코드 : "+ a +"\n제품 : "+ b +"\n가격 : "+ c +"원"+"\n품목 : " +d);
			}
		});
		b9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int code = 9;
				ProDAO dao = new ProDAO();
				ProVO2 bag2 = dao.one(code);
				String name = bag2.getName();
				String cost = bag2.getCost();
				String sort = bag2.getSort();
				
				ProVO bag = new ProVO();
				bag.setCode(code);
				bag.setName(name);
				bag.setCost(cost);
				bag.setSort(sort);
				
				int a = bag.getCode();
				String b = bag.getName();
				String c = bag.getCost();
				String d = bag.getSort();
				JOptionPane.showMessageDialog(f, "제품코드 : "+ a +"\n제품 : "+ b +"\n가격 : "+ c +"원"+"\n품목 : " +d);
			}
		});
		
		b10.addActionListener(new ActionListener() {
			// 위에서 따로 메서드 만들어서 실행시키면 가능
			// 생각보다 연결하는게 어렵지 않다.
			@Override
			public void actionPerformed(ActionEvent e) {
				new ProUI2();
			}
		});
		
		// 글꼴
		Font font = new Font("맑은고딕", Font.BOLD, 15);
		Font font2 = new Font("맑은고딕", Font.BOLD, 30);
		b10.setFont(font2);
		b10.setBackground(Color.WHITE);
		b10.setForeground(Color.RED);
		
		a1.setBackground(Color.lightGray); c1.setBackground(Color.lightGray);
		a2.setBackground(Color.lightGray); c2.setBackground(Color.lightGray);
		a3.setBackground(Color.lightGray); c3.setBackground(Color.lightGray);
		a4.setBackground(Color.lightGray); c4.setBackground(Color.lightGray);
		a5.setBackground(Color.lightGray); c5.setBackground(Color.lightGray);
		a6.setBackground(Color.lightGray); c6.setBackground(Color.lightGray);
		a7.setBackground(Color.lightGray); c7.setBackground(Color.lightGray);
		a8.setBackground(Color.lightGray); c8.setBackground(Color.lightGray);
		a9.setBackground(Color.lightGray); c9.setBackground(Color.lightGray);
		a1.setForeground(Color.WHITE); c1.setForeground(Color.WHITE);
		a2.setForeground(Color.WHITE); c2.setForeground(Color.WHITE);
		a3.setForeground(Color.WHITE); c3.setForeground(Color.WHITE);
		a4.setForeground(Color.WHITE); c4.setForeground(Color.WHITE);
		a5.setForeground(Color.WHITE); c5.setForeground(Color.WHITE);
		a6.setForeground(Color.WHITE); c6.setForeground(Color.WHITE);
		a7.setForeground(Color.WHITE); c7.setForeground(Color.WHITE);
		a8.setForeground(Color.WHITE); c8.setForeground(Color.WHITE);
		a9.setForeground(Color.WHITE); c9.setForeground(Color.WHITE);

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
		f.add(b10);

		f.setLayout(null);
		f.getContentPane().setBackground(Color.WHITE);

		f.setVisible(true);
	}

}
