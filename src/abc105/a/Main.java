package abc105.a;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int answer = n%k;
		if (n%k == 0) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
	}
}
