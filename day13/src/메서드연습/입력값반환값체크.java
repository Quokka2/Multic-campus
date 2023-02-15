package 메서드연습;

import java.util.Random;

import javax.swing.JOptionPane;

public class 입력값반환값체크 {

	public static void main(String[] args) {
		Random r = new Random();
		r.nextInt();
		int data1 = r.nextInt(5);
		// String으로 return하니까 저장공간 필요
		String data2 = JOptionPane.showInputDialog("입력값");
		// void는 반환하는게 없어서 저장할게 없음
		JOptionPane.showMessageDialog(null, data2);
		
	}

}
