package jiSuan;

import java.util.Scanner;

public class Num06 {
	public static void main(String[] args) {
		while (true) {
			Scanner p = new Scanner(System.in);
			System.out.println("���Ҫʵ�ּӷ�����������'1',���Ҫʵ�ּ�������������'2',���Ҫʵ�ֳ˷�����������'3'���Ҫʵ�ֳ�������������'4'");
			byte a = p.nextByte();
			System.out.println("�������һ����ֵ");
			if (a == 1) {
				float x = p.nextFloat();
				qaz();
				float y = p.nextFloat();
				x += y;
				System.out.println("����:" + x);
			} else if (a == 2) {
				float x = p.nextFloat();
				qaz();
				float y = p.nextFloat();
				x -= y;
				System.out.println("����:" + x);
			} else if (a == 3) {
				float x = p.nextFloat();
				qaz();
				float y = p.nextFloat();
				x *= y;
				System.out.println("����:" + x);
			} else {
				float x = p.nextFloat();
				qaz();
				float y = p.nextFloat();
				x /= y;
				System.out.println("����:" + x);
			}
			System.out.println("true|false");
			boolean f=p.nextBoolean();
			if(f) {
				continue;
			}else {
				break;
				}
		}
	}

	public static void qaz() {
		System.out.println("������ڶ�����ֵ");
	}
}
