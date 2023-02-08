package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 반복문확인문제 {

	public static void main(String[] args) {
		JFrame f= new JFrame();
		f.setSize(330, 350);
		f.getContentPane().setBackground(Color.green);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b1 = new JButton();
		b1.setText("별 10개");
		JButton b2 = new JButton();
		b2.setText("커피 5개");
		JButton b3 = new JButton();
		b3.setText("커피우유 3개");
		JButton b4 = new JButton();
		b4.setText("1:짱");
		
		Font font = new Font("맑은고딕", 1, 45);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		//1. 버튼에 액션기능을 추가하겠다고 설정
		//2. 클릭액션이 있을 때 어떤 부품이 액션처리를 어떻게할지 코딩
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용을 여기에 써주세요!!
				for (int i = 0; i < 10; i++) {System.out.print("*");}
				System.out.println();
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용을 여기에 써주세요!!
				for (int i = 0; i < 5; i++) {System.out.print("커피");}
				System.out.println();
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용을 여기에 써주세요!!
				for (int i = 0; i < 3; i++) {System.out.println("커피*우유");}
				
			}
		});
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용을 여기에 써주세요!!
				for (int i = 1; i < 4; i++) {System.out.println(i + " : 짱!");}
				
			}
		});
		
		
		f.setVisible(true);
	}

}
