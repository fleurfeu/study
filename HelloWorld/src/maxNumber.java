import java.util.Scanner;
public class maxNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please input the first number:");
		int a = sc.nextInt();
		System.out.println("please input the second number:");
		int b = sc.nextInt();
		
		int max = getMax(a,b);
		
		System.out.println("the more big number is:" + max);
	}
	
	public static int getMax(int a, int b) {
		if(a > b) return a;
		else return b;
	}
	

}
