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
			System.out.println("����������һ��������");
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
				System.out.println("̫���ˣ�");
				b++;
			}
			if (a - abs < 10 & a - abs > 0) {
				System.out.println("���ˣ�");
				b++;
			}
			if (abs - a > 10) {
				System.out.println("̫С�ˣ�");
				b++;
			}
			if (abs - a < 10 & abs - a > 0) {
				System.out.println("С�ˣ�");
				b++;
			}
			if (a == abs) {
				System.out.println("��ϲ���¶��ˣ�");
				tu++;
				b++;
				System.out.println("���ܹ�����" + (b--) + "�Σ�");
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
