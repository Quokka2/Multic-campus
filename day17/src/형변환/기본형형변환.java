package 형변환;

public class 기본형형변환 {

	public static void main(String[] args) {
		byte b1 = 100;
		int i1 = 200;
		
		i1 = b1;

		b1 = (byte) i1;
		
		double d1 = i1;
		i1 = (int) d1;
		
		int i2 = 2000;
		byte b2 = (byte)i2;

	}

}
