package 스택;

import java.util.Arrays;

public class SwapTest_자리바꾸기3 {

	public static void main(String[] args) {
		String[] str = {"햄버거", "샌드위치", "커피"};
		print(str);
		swap(str, 0, 1); //햄버거, 샌드위치 바꾸어보세요.
		print(str);
	}

	public static void swap(String[] str, int idx1, int idx2) {
		String temp = str[idx2];
		str[idx2] = str[idx1];
		str[idx1] = temp;
	}

	public static void print(String[] str) {
		System.out.println(Arrays.toString(str));
	}
}