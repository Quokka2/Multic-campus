package 프로그래머스;

public class 하샤드수 {

	public static void main(String[] args) {
		int x = 11;
		String a = x + "";
		String[] arr = a.split("");
		int[] newArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = Integer.parseInt(arr[i]);
		}
		int sum = 0;
		for (int i = 0; i < newArr.length; i++) {
			sum += newArr[i];
		}
		System.out.println(sum);

		int num = 29183;
		String z = num + "";
		System.out.println(z);
		z.indexOf(2);
		System.out.println(z.indexOf("9"));
	}

}
