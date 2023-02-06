package control;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		// 자바는 자주 사용하는 부품은 대문자로 바로 쓸 수 있다!
		//외부에서 대화창 같은 것으로 입력받은 경우 무조건 컴퓨터는 String으로 인식
		String name = JOptionPane.showInputDialog("너의 이름은?");
		
		String result = "나의 이름은 " + name + " 입니다.";
		
		System.out.println(result);
		
		//System.out.println(name + " 님 반갑습니다.");
	}

}
