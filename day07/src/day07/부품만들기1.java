package day07;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 부품만들기1 {
	
	public static void main(String[] args) {
		// 자주 사용하지 않는 부품을 만들어보자
		// 틀이 있어서 그 클을 가지고 찍어서 필요한 부품을 만들어 CPU가 조립
		// new: 틀을 가지고 찍어낼때 사용(객체만들기 아님???)
		JFrame f = new JFrame();
		f.setSize(300, 300);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		
		JButton b1 = new JButton();
		b1.setText("나는 버튼1");
		
		JButton b2 = new JButton();
		b2.setText("나는 버튼2");
		
		JLabel b3 = new JLabel();
		b3.setText("아이디");
		
		f.add(b3);	
		f.add(b1);	
		f.add(b2);	
		
		f.setVisible(true); // 요놈은 항상 맨 끝에, 이게 위에꺼 보여줘 라는 의미
	}

}

/*
 * package 순차문; import java.awt.FlowLayout; import javax.swing.JButton; import
 * javax.swing.JFrame; public class 부품만들기1 { public static void main(String[]
 * args) { // 자주 사용하지 않는 부품을 만들어보자. //틀!!이 있어서 그 틀을 가지고 찍어서 필요한 부품을 만들어 CPU가 조립!
 * //new: 틀을 가지고 찍어낼때 사용 //new JFrame()는 JFrame이라는 틀을 이용해서 부품을 찍어내라! //만든 부품은
 * 모두다 ram에 저장되어야 되어야 한다. //f변수 만들어서 부품을 넣어주세요. //f에는 JFrame이 저장되어야 함. JFrame f
 * = new JFrame(); f.setSize(300, 300);
 * 
 * //물흐르듯이 순서대로 배치해주는 부품을 램에 복사해서 가져다 놓아야 함. //FlowLayout FlowLayout flow = new
 * FlowLayout();
 * 
 * //f에 물흐르듯이 배치해주는 부품을 쓰겠다라고 조립(설정) f.setLayout(flow);
 * 
 * JButton b1 = new JButton(); b1.setText("나는 버튼1");
 * 
 * JButton b2 = new JButton(); b2.setText("나는 버튼2");
 * 
 * f.add(b1); f.add(b2);
 * 
 * //보여주는 것은 맨 끝으로!! f.setVisible(true); } }
 */