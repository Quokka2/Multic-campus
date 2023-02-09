package 로그인;

import java.util.Random;

public class 로또번호생성기 {

	public static void main(String[] args) {

		Random r = new Random();
		for (int i = 0; i < 6; i++) {
			System.out.println("로또번호 : " + (r.nextInt(45) +1));
		}
		
	}

}
