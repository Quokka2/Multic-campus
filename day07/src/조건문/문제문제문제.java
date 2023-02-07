package 조건문;

import javax.swing.JOptionPane;

public class 문제문제문제 {

	public static void main(String[] args) {
		// 1.
		String pw = JOptionPane.showInputDialog("암호를 대시오");
		
		if (pw.equals("pass")) {
			System.out.println("들어오세요.");
		} else {
			System.out.println("나가세요.");
		}
		// 2.
		String menu = JOptionPane.showInputDialog("메뉴를 선택해주세요.");
		
		if (menu.equals("라면")) {
			System.out.println("분식집으로 가요.");
		} else if (menu.equals("자장면")) {
			System.out.println("회");
		} else if (menu.equals("회")) {
			System.out.println("수산시장으로 가요.");
		} else {System.out.println("그냥 안먹어요");}
		
		// 3.
		String a = JOptionPane.showInputDialog("자본");
		String b = JOptionPane.showInputDialog("부채");

		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		if (a1 > b1) {
			System.out.println(a1);
		} else if(a1 < b1){
			System.out.println(b1);
		}
		
		// 4.
		String no = "A100EX";
		char team = no.charAt(0);
		switch (team) {
		case 'A':
			System.out.println("기획부");
			break;
		case 'B':
			System.out.println("총무부");
			break;
		case 'C':
			System.out.println("개발부");
			break;
		default:
			System.out.println("해당부서없음");
			break;
			}
	}

}
