import java.util.Scanner;
public class jttl{
	public static void main(String[] args){
		boolean ft = true;
		while(ft){
			Scanner s = new Scanner(System.in);
			int head = 1;
			int leg = 1;
			System.out.println("��������ͷ����");
			head = s.nextInt();
			int newhead = head;
			System.out.println("�������ܽ�����");
			leg = s.nextInt();
			if(leg % 2 != 0){
				System.out.println("��������Ǵ�����Ŀ�������������⡣");
				continue;
			}
			if(head * 2 > leg){
				System.out.println("��������Ǵ�����Ŀ�������������⡣");
				continue;
			}
		int tu = 0;
		boolean tf = false;
		while(true){
			if((head * 2 + tu * 4) == leg && head + tu == newhead){
				System.out.println("tu =" + tu);
				int ji = newhead - tu;
				System.out.println("ji =" + ji);
				break;
			}else{
				tu++;
				head--;
			}
		}
		if((head * 2 + tu * 4) == leg && head + tu == newhead){
		break;
			}
		}
	}
}
