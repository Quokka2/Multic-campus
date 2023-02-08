package 반복문;

import javax.swing.JOptionPane;

public class For2 {

	public static void main(String[] args) {
		for (;;) {
			System.out.println("잘쓰지 않음.");
			String data = JOptionPane.showInputDialog("종료 Y를 입력하시오");
			if (data.equals("Y")) {
				System.out.println("끝");
				break; // for문의 break!
			}
		}
	}
}
