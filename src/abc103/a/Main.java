package abc103.a;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// A1-A3を受け付ける
		int a[] = new int[3];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		// 3通りの絶対値を格納する配列Xを作成する
		// 3通りの絶対値を合計する
		// 3通りの中で最も大きいものを合計から引く
		// 最低コストmin_costを出力する
	}
}
