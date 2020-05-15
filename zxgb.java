import java.util.Scanner;

public class zxgb{
	public static void main(String[] args){
		System.out.println("请输入第一个数值：");
		Scanner s = new Scanner(System.in);
		double num1 = s.nextDouble();
		System.out.println("请输入第一个数值：");
		double num2 = s.nextDouble();
		for(int i = 1; i <= 2; i++){
		if(num1 > num2){
			while(true){
				double num3 = num1 % num2;
				if(num3 == 0){
					System.out.println("最大公因数 = " + num2);
					break;
				}else{
					num1 = num2;
					num2 = num3;
				}
			}
		}else if(num1 < num2){
			double num4 = num1;
			num1 = num2;
			num2 = num4;
	}
}
}
}
