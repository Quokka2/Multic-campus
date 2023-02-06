package question;

import javax.swing.JOptionPane;

public class Exam {

	public static void main(String[] args) {
		String date1 = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String date2 = JOptionPane.showInputDialog("수업 끝나고 무엇을 하실 예정인가요?");
		
		String output = date1 + "에 수업 후 나는 " + date2 + "할 예정";
		
		System.out.println(output);
	}

}
