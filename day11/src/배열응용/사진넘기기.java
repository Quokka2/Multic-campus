package 배열응용;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 사진넘기기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("극장예매시스템");
		f.setSize(500, 500);
		f.getContentPane().setBackground(Color.gray);
		
		JLabel result = new JLabel();

		
		JButton btn1 = new JButton("<<");
		f.getContentPane().add(btn1, BorderLayout.WEST);
		JButton btn2 = new JButton(">>");
		f.getContentPane().add(btn2, BorderLayout.EAST);
		

		f.add(result);
		f.setVisible(true);
	}

}
