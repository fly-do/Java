package jiSuan;

import java.util.Scanner;

public class Num06 {
	public static void main(String[] args) {
		while (true) {
			Scanner p = new Scanner(System.in);
			System.out.println("如果要实现加法运算则输入'1',如果要实现减法运算则输入'2',如果要实现乘法运算则输入'3'如果要实现除法运算则输入'4'");
			byte a = p.nextByte();
			System.out.println("请输入第一个数值");
			if (a == 1) {
				float x = p.nextFloat();
				qaz();
				float y = p.nextFloat();
				x += y;
				System.out.println("答案是:" + x);
			} else if (a == 2) {
				float x = p.nextFloat();
				qaz();
				float y = p.nextFloat();
				x -= y;
				System.out.println("答案是:" + x);
			} else if (a == 3) {
				float x = p.nextFloat();
				qaz();
				float y = p.nextFloat();
				x *= y;
				System.out.println("答案是:" + x);
			} else {
				float x = p.nextFloat();
				qaz();
				float y = p.nextFloat();
				x /= y;
				System.out.println("答案是:" + x);
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
		System.out.println("请输入第二个数值");
	}
}
