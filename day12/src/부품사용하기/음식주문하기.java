package 부품사용하기;

import 부품만들기.음식;

public class 음식주문하기 {

	public static void main(String[] args) {
		// 제육볶음 주문
		음식 p1 = new 음식();
		p1.주문하다();
		p1.price = 8000;
		p1.quantity = "1인분";
		System.out.println("제육볶음 " + p1.quantity + "이요!!!");
		p1.계산하다();
		System.out.println(p1.price + "원 입니다!!!");
		System.out.println();
		// 떡튀순 주문
		음식 p2 = new 음식();
		p2.주문하다();
		p2.price = 10000;
		p2.quantity = "2인분";
		System.out.println("떡튀순 " + p2.quantity + "이요!!!");
		p2.계산하다();
		System.out.println((p2.price * 2) + "원 입니다!!!");
	}
}
