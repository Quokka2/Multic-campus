package 조건문;

import javax.swing.JOptionPane;

public class 인기조사10명 {

	public static void main(String[] args) {

		int full = 0;
		int noFull = 0;
		int onFull = 0;
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("1. 아이유 2. 유재석 3. BTS");
			if (data.equals("1")) {
				full++;
			} else if (data.equals("2")) {
				noFull++;
			} else if (data.equals("3"))
				onFull++;
		}
		
		System.out.println("아이유 " + full + "명");
		System.out.println("유재석 " + noFull + "명");
		System.out.println("BTS " + onFull + "명");

	}
}