package 프로그래머스;

import java.util.*;

public class 정수내림차순으로배치하기 {

	public static void main(String[] args) {
		long n = 123456789;
        String a = n + "";
        String[] array = a.split("");
        Arrays.sort(array,Collections.reverseOrder());
        String sum = "";
        for(int i=0; i < array.length; i++){
            sum += array[i];
        }
        long answer = Long.parseLong(sum);
        System.out.println(answer);
	}
}