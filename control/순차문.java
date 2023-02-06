package control;

import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		// 자바는 자주 사용하는 부품은 대문자로 바로 쓸 수 있다!
		//외부에서 대화창 같은 것으로 입력받은 경우 무조건 컴퓨터는 String으로 인식
		String name1 = JOptionPane.showInputDialog("당신이 좋아하는 운동은?");
		String name2 = JOptionPane.showInputDialog("당신이 좋아하는 요일은?");
		
		String result = name2 + "에 저는 " + name1 + "(을/를) 합니다.";
		
		System.out.println(result);
		
		//System.out.println(name + " 님 반갑습니다.");
	}

}
