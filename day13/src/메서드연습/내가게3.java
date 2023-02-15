package 메서드연습;

public class 내가게3 {

	public static void main(String[] args) {
		계산기3 cal = new 계산기3();
		int price = 7000;
		int count1 = 5;
		int count2 = 4;
		
		int result1 = cal.add(count1, count2);
		int result2 = cal.minus(count1, count2);
		int result3 = cal.mul(price, count1);
		int result4 =cal.mul(price, count2);
		int total = cal.mul(price, result1);
		int result5 = cal.dic(total, result1);
		
		System.out.println("손님의 총 합은? "+ result1 + "명");
		System.out.println("손님 수 차이는? " + Math.abs(result2) + "명");
		System.out.println("오전 정산 : " + result3 + "원");
		System.out.println("오후 정산 : " + result4 + "원");
		System.out.println("매출 : " + total + "원");
		System.out.println("1인당 결제금액은? " + result5 + "원");
		
	}

}
