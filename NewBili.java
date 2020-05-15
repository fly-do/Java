import java.util.Scanner;

public class NewBili{
	public static void main(String[] args){
		int m = 10000;
		Scanner s = new Scanner(System.in);
		System.out.println("ÇëÊäÈë±ÈÀıÊ½£º");
		String bili = s.next();
		String[] bl1 = bili.split(":"); 
		String[] bl2 = bl1[1].split("=");
		String[] bl3 = {bl1[0],bl2[0],bl2[1],bl1[2]};
		for(int i = 0; i < 4; i++){
			if(bl3[i].equals("x")){
				m = i;
			}
		}
		if(m != 0 && m != 3){
			double wai = Integer.parseInt(bl3[1]) * Integer.parseInt(bl3[3]);
			if(1 != m){
				System.out.println("x = " + (wai / Double.parseDouble(bl3[1])));
			}else{
				System.out.println("x = " + (wai / Double.parseDouble(bl3[2])));
			}
		}else{
			double wai = Double.parseDouble(bl3[1]) * Double.parseDouble(bl3[2]);
			if(0 != m){
				System.out.println("x = " + (wai / Double.parseDouble(bl3[0])));
			}else{
				System.out.println("x = " + (wai / Double.parseDouble(bl3[3])));
			}
		}
	}
}
