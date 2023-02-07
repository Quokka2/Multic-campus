package day07;

import javax.swing.JOptionPane;

public class 순차문_확인문제 {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("신장(m로 입력하세요)");
		String b = JOptionPane.showInputDialog("체중");
		
				
		// Integer.parseInt(a); --> 이거 사용하면 타입변경가능(int로 변경)
		// Double.parseDouble(a); --> 이거 사용하면 타입변경가능(double로 변경)
		double a1 = Double.parseDouble(a);
		double b1 = Double.parseDouble(b);
		double result = b1 / (a1 * a1);
		if (result > 30) {
			System.out.println("고도비만");
		} else if (result > 25 && result < 30) {
			System.out.println("비만");
		} else if (result > 23 && result < 25) {
			System.out.println("과체중");
		} else {
			System.out.println("정상");
		}
		System.out.println(result);

	}

}
