package LogIn;

import java.util.Scanner;

public class LogIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username = "hcy";
		String password = "900207";
		
		for(int i = 0; i < 3; i ++ )
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("�������û�����");
			String name = sc.nextLine();
			
			System.out.println("���������룺");
			String pwd = sc.nextLine();
			
			if(name.equals(username) && pwd.equals(pwd))
			{
				System.out.println("��¼�ɹ���");
				break;
			}
			else {
				System.out.println("��¼ʧ�ܣ��㻹��"+ (2-i)+"�λ��ᡣ");
			}
		}
	}

}
