package LogIn;

import java.util.Scanner;

public class tongjizifucishu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������ַ�����");
		String str = sc.nextLine();
		
		int a = 0, b = 0, c = 0;
		
		for(int i = 0; i < str.length(); i++ ) {
			char d = str.charAt(i);
			if(d >= 'a' && d <= 'z') a ++ ;
			else if(d >='A' && d <= 'Z') b ++ ;
			else if(d >='0' && d <= '9') c ++ ;
			
		}
		System.out.println("Сд��ĸ�ĸ���Ϊ��" + a);
		System.out.println("��д��ĸ�ĸ���Ϊ��" + b);
		System.out.println("���ֵĸ���Ϊ��" + c);

	}

}
