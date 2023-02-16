package 생성자;

public class 은행통장사용하기 {

	public static void main(String[] args) {
		통장 여행통장 = new 통장("쿼카", "000000", 100000000);
		통장 주택청약 = new 통장("쿼카", "000000", 100000000);
//		System.out.println(여행통장.name);
//		System.out.println(여행통장.ssn);
//		System.out.println(여행통장.money);
		System.out.println(여행통장);
		System.out.println(주택청약);

	}

}
