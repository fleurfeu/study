package LogIn;

import java.util.Scanner;

public class sbreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		
		String str = sc.nextLine();
		
		
		String s2 = myreverse(str);
		
		System.out.println(s2);

	}
	
	public static String myreverse(String s) {
		/*
		StringBuilder str1 = new StringBuilder(s);
		str.reverse();
		String s1 = str.toString();
		return s1;
		*/
		//等价
		return new StringBuilder(s).reverse().toString();
	}

}
