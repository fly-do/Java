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
			zhangsan.renwu = "����";
		} else if (num == 1) {
			zhangsan.renwu = "Ů��";

		} else if (num == 2) {
			zhangsan.renwu = "Ԥ�Լ�";

		} else if (num == 3) {
			zhangsan.renwu = "����";

		} else if (num == 4) {
			zhangsan.renwu = "ƽ��";
		} else {
			zhangsan.renwu = "ƽ��";
		}
		int num1;
		num1 = rd.nextInt(5);
		while (num == num1) {
			num1 = rd.nextInt(5);
		}
		LiSi ls = new LiSi();
		if (num1 == 0) {
			ls.renwu = "����";
		} else if (num1 == 1) {
			ls.renwu = "Ů��";
		} else if (num1 == 2) {
			ls.renwu = "Ԥ�Լ�";
		} else if (num1 == 3) {
			ls.renwu = "����";
		} else if (num1 == 4) {
			ls.renwu = "ƽ��";
		} else {
			ls.renwu = "ƽ��";
		}
		int num2;
		num2 = rd.nextInt(5);
		while (num == num2 | num1 == num2) {
			num2 = rd.nextInt(5);
		}
		WangEr we = new WangEr();
		if (num2 == 0) {
			we.renwu = "����";
		} else if (num2 == 1) {
			we.renwu = "Ů��";
		} else if (num2 == 2) {
			we.renwu = "Ԥ�Լ�";
		} else if (num2 == 3) {
			we.renwu = "����";
		} else if (num2 == 4) {
			we.renwu = "ƽ��";
		} else {
			we.renwu = "ƽ��";
		}
		int num3;
		num3 = rd.nextInt(5);
		while (num == num3 | num1 == num3 | num2 == num3) {
			num3 = rd.nextInt(5);
		}
		MaZi mz = new MaZi();
		if (num3 == 0) {
			mz.renwu = "����";
		} else if (num3 == 1) {
			mz.renwu = "Ů��";
		} else if (num3 == 2) {
			mz.renwu = "Ԥ�Լ�";
		} else if (num3 == 3) {
			mz.renwu = "����";
		} else if (num3 == 4) {
			mz.renwu = "ƽ��";
		} else {
			mz.renwu = "ƽ��";
		}
		int num4;
		num4 = rd.nextInt(5);
		while (num == num4 | num1 == num4 | num2 == num4 | num3 == num4) {
			num4 = rd.nextInt(5);
		}
		Zoom z1 = new Zoom();
		if (num4 == 0) {
			z1.renwu = "����";
		} else if (num4 == 1) {
			z1.renwu = "Ů��";
		} else if (num4 == 2) {
			z1.renwu = "Ԥ�Լ�";
		} else if (num4 == 3) {
			z1.renwu = "����";
		} else if (num4 == 4) {
			z1.renwu = "ƽ��";
		} else {
			z1.renwu = "ƽ��";
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
			z2.renwu = "����";
		} else if (num5 == 1) {
			z2.renwu = "Ů��";
		} else if (num5 == 2) {
			z2.renwu = "Ԥ�Լ�";
		} else if (num5 == 3) {
			z2.renwu = "����";
		} else if (num5 == 4) {
			z2.renwu = "ƽ��";
		} else {
			z2.renwu = "ƽ��";
		}
		for (int i = 1; i <= 6; i++) {
			String na = s.next();
			if (na.equals("����")) {
				zhangsan zs = new zhangsan();
				System.out.println("����" + zs.renwu);
			} else if (na.equals("����")) {
				System.out.println("����" + ls.renwu);
			} else if (na.equals("����")) {
				System.out.println("����" + we.renwu);
			} else if (na.equals("����")) {
				System.out.println("����" + mz.renwu);
			} else if (na.equals("zoom")) {
				System.out.println("����" + z1.renwu);
			} else {
				System.out.println("����" + z2.renwu);
			}
		}
		int du = 1;
		int jie = 1;
		while (true) {
			System.out.println("��������,����������,����Ҫɱ˭?");
			String name = s.next();
			if (name.equals("����")) {
				zhangsan zs = new zhangsan();
				zs.number -= 1;
			} else if (name.equals("����")) {
				ls.number -= 1;
			} else if (name.equals("����")) {
				we.number -= 1;
			} else if (name.equals("����")) {
				mz.number -= 1;
			} else if (name.equals("zoom")) {
				z1.number -= 1;
			} else {
				z2.number -= 1;
			}
			System.out.println("���������,Ů��������.");
			System.out.println("����" + name + "����,����Ҫ������Ҫ��?");
			System.out.println("���Ҫ���밴1,���Ҫ���밴2,����־Ȼ�Ҫ���밴3.");
			int number = s.nextInt();
			int du1 = 1;
			if (number == 1 && du != 0) {
				System.out.println("��Ҫ��˭?");
				bl.edc = s.next();
				if (bl.edc.equals("����")) {
					zhangsan zs = new zhangsan();
					zs.number -= 1;
				} else if (bl.edc.equals("����")) {
					ls.number -= 1;
				} else if (bl.edc.equals("����")) {
					we.number -= 1;
				} else if (bl.edc.equals("����")) {
					mz.number -= 1;
				} else if (bl.edc.equals("zoom")) {
					z1.number -= 1;
				} else {
					z2.number -= 1;
				}
				du1--;
				du--;
			} else if (du != 1) {
				System.out.println("��û�ж�ҩ��");

			} else if (number == 2 && jie != 0) {
				if (name.equals("����")) {
					zhangsan zs = new zhangsan();
					zs.number += 1;
					jie--;
				} else if (name.equals("����")) {
					ls.number += 1;
					jie--;
				} else if (name.equals("����")) {
					we.number += 1;
					jie--;
				} else if (name.equals("����")) {
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
				System.out.println("��û�н�ҩ��!");
			}
			System.out.println("Ů�������,Ԥ�Լ�������,����,��Ҫ��˭�����?");
			String name2 = s.next();
			if (name2.equals("����")) {
				zhangsan zs = new zhangsan();
				System.out.println("����" + zs.renwu);
			} else if (name2.equals("����")) {
				System.out.println("����" + ls.renwu);
			} else if (name2.equals("����")) {
				System.out.println("����" + we.renwu);
			} else if (name2.equals("����")) {
				System.out.println("����" + mz.renwu);
			} else if (name2.equals("zoom")) {
				System.out.println("����" + z1.renwu);
			} else {
				System.out.println("����" + z2.renwu);
			}
			int abc = 0;
			int hr = 0;
			zhangsan zs = new zhangsan();
			if (zs.renwu.equals("����")) {
				abc = zs.number;
			} else {
				hr = zs.number;
			}
			if (ls.renwu.equals("����")) {
				abc = ls.number;
			} else {
				hr = ls.number;
			}
			if (we.renwu.equals("����")) {
				abc = we.number;
			} else {
				hr = we.number;
			}
			if (mz.renwu.equals("����")) {
				abc = mz.number;
			} else {
				hr = mz.number;
			}
			if (z1.renwu.equals("����")) {
				abc = z1.number;
			} else {
				hr = z1.number;
			}
			if (z2.renwu.equals("����")) {
				abc = z2.number;
			} else {
				hr = z2.number;
			}
			if (abc == 0) {
				System.out.println("ƽ��ʤ��!");
				break;
			} else if (langrensha.zhangsan.number + LiSi.number + we.number + mz.number + z1.number + z2.number == 6) {
				System.out.println("�����Ǹ�ƽ��ҹ!");
			} else if (langrensha.zhangsan.number + LiSi.number + we.number + mz.number + z1.number + z2.number != 6
					& abc != 0) {
				System.out.println("����" + name + "���ˣ�");
				if (du1 != 1) {
					System.out.println("����" + bl.edc + "����!");
				}
			} else if (hr == 0) {
				System.out.println("����ʤ��!");
				break;
			}
			if (langrensha.zhangsan.number + LiSi.number + we.number + mz.number + z1.number + z2.number != 6) {
				System.out.println("ʤ���Ѷ�?����ʤ���밴1,ƽ��ʤ���밴2,δ��ʤ���밴3");
				int win = s.nextInt();
				if (win == 1) {
					System.out.println("����ʤ��!");
					break;
				} else if (win == 2) {
					System.out.println("ƽ��ʤ��!");
					break;
				}
			}
		}
	}
}
