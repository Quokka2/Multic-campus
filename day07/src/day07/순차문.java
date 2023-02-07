package day07;

import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("당신의 취미는?");
		String b = JOptionPane.showInputDialog("언제하시나요?");
		
		String result = b+"에 "+a+"을 하시는군요.";
		
		System.out.println(result);

	}

}


