package task111;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String txt = sc.nextLine();
		Stack<String> stack = new Stack<>();
		String[] arr = txt.split("[ ]");
		for (String a : arr) {
			stack.push(a);
		}
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
		sc.close();
	}
}
