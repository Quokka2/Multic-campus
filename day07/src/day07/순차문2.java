package day07;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("정수를 입력하시오-1");
		String b = JOptionPane.showInputDialog("정수를 입력하시오-2");
		
				
		// Integer.parseInt(a); --> 이거 사용하면 타입변경가능(int로 변경)
		// Double.parseInt(a); --> 이거 사용하면 타입변경가능(double로 변경)
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		int result = a1 + b1;
		
		System.out.println(result);

	}

}
