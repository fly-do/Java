package caishu;

import java.util.Scanner;

public class num01 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("mingtishu:");
		int qaz = x.nextInt();
		int b = 0;
		int tu = 1;
		while (true) {
			System.out.println("请随意输入一个整数：");
			int a = x.nextInt();
			int abs;
			if (tu == 1) {
				abs = qaz;
			} else if (tu == 2) {
				abs = qaz;
			} else {
				abs = qaz;
			}
			if (a - abs > 10) {
				System.out.println("太大了！");
				b++;
			}
			if (a - abs < 10 & a - abs > 0) {
				System.out.println("大了！");
				b++;
			}
			if (abs - a > 10) {
				System.out.println("太小了！");
				b++;
			}
			if (abs - a < 10 & abs - a > 0) {
				System.out.println("小了！");
				b++;
			}
			if (a == abs) {
				System.out.println("恭喜您猜对了！");
				tu++;
				b++;
				System.out.println("您总共猜了" + (b--) + "次！");
				System.out.println("true|false");
				boolean p = x.nextBoolean();
				if (p) {
					continue;
				} else {
					break;
				}
			}
		}
	}

}
