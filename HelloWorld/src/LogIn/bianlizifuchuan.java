package LogIn;

import java.util.Scanner;

public class bianlizifuchuan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ���ַ�����");
		String line = sc.nextLine();
		
		//��ȡ�ַ����еĵ�0���ַ�
		//System.out.println(line.charAt(0));
		/*
		for(int i = 0; i < 3; i ++ )
		{
			System.out.println(line.charAt(i));
		}
		*/
		
//		��ȡ�ַ�������
		for(int i = 0; i <line.length(); i ++ )
			System.out.println(line.charAt(i));
		
	}

}
