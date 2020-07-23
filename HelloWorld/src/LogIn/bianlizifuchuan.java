package LogIn;

import java.util.Scanner;

public class bianlizifuchuan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个字符串：");
		String line = sc.nextLine();
		
		//获取字符串中的第0个字符
		//System.out.println(line.charAt(0));
		/*
		for(int i = 0; i < 3; i ++ )
		{
			System.out.println(line.charAt(i));
		}
		*/
		
//		获取字符串长度
		for(int i = 0; i <line.length(); i ++ )
			System.out.println(line.charAt(i));
		
	}

}
