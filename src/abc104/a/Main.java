package abc104.a;

import java.util.Scanner;

/* 簡単すぎないか？ */

public class Main {
	public static void main(String[] args) {
		// ここは Scanner in のほうがわかりやすいだろうか？
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		if (r < 1200) {
			System.out.println("ABC");
		} else if (r >= 1200 && r < 2800) {
			System.out.println("ARC");
		} else {
			System.out.println("AGC");
		}
	}
}