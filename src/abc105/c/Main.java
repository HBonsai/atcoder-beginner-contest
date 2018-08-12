package abc105.c;

import java.util.Scanner;

//import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// 制約から用意するのは10^9 ≒ 2^30までで良い
		String s = "";
//		int i = 0;
//		for (int j = 30; j >= 0; j--) {
//			if (n/((-2)^j) != 0) {
//				i = j - 1;
//				s += "1";
//				break;
//			}
//		}
		int i = 30;
		while (i >= 0) {
			if (n/((-2)^i) != 0) {
				s = s + "1";
				n  = n%((-2)^i);
			} else {
				s = s + "0";
			}
			i--;
		}
		System.out.println(s);
	}
}
