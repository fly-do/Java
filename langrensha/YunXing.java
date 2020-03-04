package langrensha;

import java.util.Random;
import java.util.Scanner;

public class YunXing {
	public static void main(String[] args) {
		String name3;
		Scanner s = new Scanner(System.in);
		zhangsan zhangsan = new zhangsan();
		BianLiang bl = new BianLiang();
		Random rd = new Random();
		int num = rd.nextInt(5);
		if (num == 0) {
			zhangsan.renwu = "狼人";
		} else if (num == 1) {
			zhangsan.renwu = "女巫";

		} else if (num == 2) {
			zhangsan.renwu = "预言家";

		} else if (num == 3) {
			zhangsan.renwu = "狼人";

		} else if (num == 4) {
			zhangsan.renwu = "平民";
		} else {
			zhangsan.renwu = "平民";
		}
		int num1;
		num1 = rd.nextInt(5);
		while (num == num1) {
			num1 = rd.nextInt(5);
		}
		LiSi ls = new LiSi();
		if (num1 == 0) {
			ls.renwu = "狼人";
		} else if (num1 == 1) {
			ls.renwu = "女巫";
		} else if (num1 == 2) {
			ls.renwu = "预言家";
		} else if (num1 == 3) {
			ls.renwu = "狼人";
		} else if (num1 == 4) {
			ls.renwu = "平民";
		} else {
			ls.renwu = "平民";
		}
		int num2;
		num2 = rd.nextInt(5);
		while (num == num2 | num1 == num2) {
			num2 = rd.nextInt(5);
		}
		WangEr we = new WangEr();
		if (num2 == 0) {
			we.renwu = "狼人";
		} else if (num2 == 1) {
			we.renwu = "女巫";
		} else if (num2 == 2) {
			we.renwu = "预言家";
		} else if (num2 == 3) {
			we.renwu = "狼人";
		} else if (num2 == 4) {
			we.renwu = "平民";
		} else {
			we.renwu = "平民";
		}
		int num3;
		num3 = rd.nextInt(5);
		while (num == num3 | num1 == num3 | num2 == num3) {
			num3 = rd.nextInt(5);
		}
		MaZi mz = new MaZi();
		if (num3 == 0) {
			mz.renwu = "狼人";
		} else if (num3 == 1) {
			mz.renwu = "女巫";
		} else if (num3 == 2) {
			mz.renwu = "预言家";
		} else if (num3 == 3) {
			mz.renwu = "狼人";
		} else if (num3 == 4) {
			mz.renwu = "平民";
		} else {
			mz.renwu = "平民";
		}
		int num4;
		num4 = rd.nextInt(5);
		while (num == num4 | num1 == num4 | num2 == num4 | num3 == num4) {
			num4 = rd.nextInt(5);
		}
		Zoom z1 = new Zoom();
		if (num4 == 0) {
			z1.renwu = "狼人";
		} else if (num4 == 1) {
			z1.renwu = "女巫";
		} else if (num4 == 2) {
			z1.renwu = "预言家";
		} else if (num4 == 3) {
			z1.renwu = "狼人";
		} else if (num4 == 4) {
			z1.renwu = "平民";
		} else {
			z1.renwu = "平民";
		}
		int num5 = rd.nextInt(5);
		int a = 15;
		int niuniu = num += num1 += num2 += num3 += num4;
		while (num == num5 | num1 == num5 | num2 == num5 | num3 == num5 | num4 == num5) {
			num5 = rd.nextInt(5);
		}
		num5 = a -= niuniu;
		Zip z2 = new Zip();
		if (num5 == 0) {
			z2.renwu = "狼人";
		} else if (num5 == 1) {
			z2.renwu = "女巫";
		} else if (num5 == 2) {
			z2.renwu = "预言家";
		} else if (num5 == 3) {
			z2.renwu = "狼人";
		} else if (num5 == 4) {
			z2.renwu = "平民";
		} else {
			z2.renwu = "平民";
		}
		for (int i = 1; i <= 6; i++) {
			String na = s.next();
			if (na.equals("张三")) {
				zhangsan zs = new zhangsan();
				System.out.println("你是" + zs.renwu);
			} else if (na.equals("李四")) {
				System.out.println("你是" + ls.renwu);
			} else if (na.equals("王二")) {
				System.out.println("你是" + we.renwu);
			} else if (na.equals("麻子")) {
				System.out.println("你是" + mz.renwu);
			} else if (na.equals("zoom")) {
				System.out.println("你是" + z1.renwu);
			} else {
				System.out.println("你是" + z2.renwu);
			}
		}
		int du = 1;
		int jie = 1;
		while (true) {
			System.out.println("天黑请闭眼,狼人请睁眼,你们要杀谁?");
			String name = s.next();
			if (name.equals("张三")) {
				zhangsan zs = new zhangsan();
				zs.number -= 1;
			} else if (name.equals("李四")) {
				ls.number -= 1;
			} else if (name.equals("王二")) {
				we.number -= 1;
			} else if (name.equals("麻子")) {
				mz.number -= 1;
			} else if (name.equals("zoom")) {
				z1.number -= 1;
			} else {
				z2.number -= 1;
			}
			System.out.println("狼人请闭眼,女巫请睁眼.");
			System.out.println("今晚" + name + "死了,你是要毒还是要救?");
			System.out.println("如果要毒请按1,如果要救请按2,如果又救还要毒请按3.");
			int number = s.nextInt();
			int du1 = 1;
			if (number == 1 && du != 0) {
				System.out.println("你要毒谁?");
				bl.edc = s.next();
				if (bl.edc.equals("张三")) {
					zhangsan zs = new zhangsan();
					zs.number -= 1;
				} else if (bl.edc.equals("李四")) {
					ls.number -= 1;
				} else if (bl.edc.equals("王二")) {
					we.number -= 1;
				} else if (bl.edc.equals("麻子")) {
					mz.number -= 1;
				} else if (bl.edc.equals("zoom")) {
					z1.number -= 1;
				} else {
					z2.number -= 1;
				}
				du1--;
				du--;
			} else if (du != 1) {
				System.out.println("您没有毒药了");

			} else if (number == 2 && jie != 0) {
				if (name.equals("张三")) {
					zhangsan zs = new zhangsan();
					zs.number += 1;
					jie--;
				} else if (name.equals("李四")) {
					ls.number += 1;
					jie--;
				} else if (name.equals("王二")) {
					we.number += 1;
					jie--;
				} else if (name.equals("麻子")) {
					mz.number += 1;
					jie--;
				} else if (name.equals("zoom")) {
					z1.number += 1;
					jie--;
				} else if (name.equals("zip")) {
					z2.number += 1;
					jie--;
				}
			} else if (jie != 0) {
				System.out.println("您没有解药了!");
			}
			System.out.println("女巫请闭眼,预言家请睁眼,请问,你要测谁的身份?");
			String name2 = s.next();
			if (name2.equals("张三")) {
				zhangsan zs = new zhangsan();
				System.out.println("他是" + zs.renwu);
			} else if (name2.equals("李四")) {
				System.out.println("他是" + ls.renwu);
			} else if (name2.equals("王二")) {
				System.out.println("他是" + we.renwu);
			} else if (name2.equals("麻子")) {
				System.out.println("他是" + mz.renwu);
			} else if (name2.equals("zoom")) {
				System.out.println("他是" + z1.renwu);
			} else {
				System.out.println("他是" + z2.renwu);
			}
			int abc = 0;
			int hr = 0;
			zhangsan zs = new zhangsan();
			if (zs.renwu.equals("狼人")) {
				abc = zs.number;
			} else {
				hr = zs.number;
			}
			if (ls.renwu.equals("狼人")) {
				abc = ls.number;
			} else {
				hr = ls.number;
			}
			if (we.renwu.equals("狼人")) {
				abc = we.number;
			} else {
				hr = we.number;
			}
			if (mz.renwu.equals("狼人")) {
				abc = mz.number;
			} else {
				hr = mz.number;
			}
			if (z1.renwu.equals("狼人")) {
				abc = z1.number;
			} else {
				hr = z1.number;
			}
			if (z2.renwu.equals("狼人")) {
				abc = z2.number;
			} else {
				hr = z2.number;
			}
			if (abc == 0) {
				System.out.println("平民胜利!");
				break;
			} else if (langrensha.zhangsan.number + LiSi.number + we.number + mz.number + z1.number + z2.number == 6) {
				System.out.println("今晚是个平安夜!");
			} else if (langrensha.zhangsan.number + LiSi.number + we.number + mz.number + z1.number + z2.number != 6
					& abc != 0) {
				System.out.println("今晚" + name + "死了！");
				if (du1 != 1) {
					System.out.println("今晚" + bl.edc + "死了!");
				}
			} else if (hr == 0) {
				System.out.println("狼人胜利!");
				break;
			}
			if (langrensha.zhangsan.number + LiSi.number + we.number + mz.number + z1.number + z2.number != 6) {
				System.out.println("胜负已定?狼人胜利请按1,平民胜利请按2,未分胜负请按3");
				int win = s.nextInt();
				if (win == 1) {
					System.out.println("狼人胜利!");
					break;
				} else if (win == 2) {
					System.out.println("平民胜利!");
					break;
				}
			}
		}
	}
}
