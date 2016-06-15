package task112;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String txt = sc.nextLine();
		Queue<String> queue = new LinkedList<String>();
		String[] arr = txt.split("[ ]");
		for (String a : arr) {
			queue.offer(a);
		}
		while (queue.size() > 0) {
			String word = queue.poll();
			if (word.length() > 3) {
				System.out.print(word + " ");
			}
		}

		sc.close();
	}

}
