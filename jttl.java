import java.util.Scanner;
public class jttl{
	public static void main(String[] args){
		boolean ft = true;
		while(ft){
			Scanner s = new Scanner(System.in);
			int head = 1;
			int leg = 1;
			System.out.println("请输入总头数：");
			head = s.nextInt();
			int newhead = head;
			System.out.println("请输入总脚数：");
			leg = s.nextInt();
			if(leg % 2 != 0){
				System.out.println("您输入的是错误题目，请您重新命题。");
				continue;
			}
			if(head * 2 > leg){
				System.out.println("您输入的是错误题目，请您重新命题。");
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
