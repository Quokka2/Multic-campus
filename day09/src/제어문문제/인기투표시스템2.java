package 제어문문제;

import javax.swing.JOptionPane;

public class 인기투표시스템2 {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int c = 0;
		while (true) {
			String choice = JOptionPane.showInputDialog("1. 아이유 2. 유재석 3. BTS");
			//System.out.println("1.아이유 2.BTS 3.뉴진스 4.종료");
			//System.out.println("선택 번호>> ");

			if (choice.equals("4")) {
				System.out.println("시스템을 종료합니다.");
				System.out.println("아이유 : " + a + "표");
				System.out.println("유재석 : " + b + "표");
				System.out.println("BTS : " + c + "표");
				break;
			}
			if (choice.equals("1")) {
				a++;
			} else if (choice.equals("2")) {
				b++;
			} else if (choice.equals("3")) {
				c++;
			} else {
				System.out.println("해당 번호가 없습니다.");
			}
		}
	}
}