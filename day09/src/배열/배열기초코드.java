package 배열;

public class 배열기초코드 {

	public static void main(String[] args) {
		int[] x = new int[5];
		System.out.println(x.length);
		x[0] = 100;
		System.out.println(x[0]);
		x[4] = 500;
		System.out.println(x[4]);
		x[2] = 200;
		System.out.println(x[2]);
		for (int s = 0; s < x.length; s++) {	
			System.out.println(s+ " : " + x[s]);
		}
		
		
	}

}