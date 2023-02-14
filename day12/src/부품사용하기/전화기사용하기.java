package 부품사용하기;

import 부품만들기.전화기;

public class 전화기사용하기 {

	public static void main(String[] args) {
		// 전화기를 만들어보자. 2개를 만들어보자
		전화기 p1 = new 전화기();
		p1.인터넷하다();
		p1.카톡하다();
		p1.price = 10000;
		p1.shape = "갤럭시 울트라";
		System.out.println("가격 : " + p1.price);
		System.out.println("기종 : " + p1.shape);
		
		전화기 p2 = new 전화기();
		p2.인터넷하다();
		p2.카톡하다();
		p2.price = 20000;
		p2.shape = "아이폰15";
		System.out.println("가격 : " + p2.price);
		System.out.println("기종 : " + p2.shape);

	}

}
