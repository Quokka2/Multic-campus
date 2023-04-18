package 컬렉션2;

import java.util.Stack;

public class 같은숫자는싫어_stack {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		Stack<Integer> stack = new Stack<>();
		stack.push(arr[0]);
		
		for (int x : arr) {
			if (x != stack.peek()) {
				stack.push(x);
			}
		}
		System.out.println(stack);
	}

}