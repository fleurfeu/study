import java.util.ArrayList;
import java.util.Scanner;

public class HRS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<employee> array = new ArrayList<>();
		while(true) {
			
			System.out.println("��������������ӭ������Ƹϵͳ������������");
			System.out.println("1 ��Ӹ�����Ϣ");
			System.out.println("2 ɾ��������Ϣ");
			System.out.println("3 �޸ĸ�����Ϣ");
			System.out.println("4 �鿴������Ϣ");
			System.out.println("5 �˳�");
			System.out.println("���������ѡ��");
			
			Scanner sc = new Scanner(System.in);
			int choose = sc.nextInt();
			
			switch (choose) {
			case 1:
				add(array);
				break;
			case 2:
				delet(array);
				break;
			case 3:
				update(array);
				break;
			case 4:
				disply(array);
				break;
			case 5:
				System.out.println("ллʹ�ø�ϵͳ��");
				//break;
				System.exit(0);
			
			}
		}
		
	}
	
	public static void add(ArrayList<employee> array) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������������");
		String name = sc.nextLine();
		System.out.println("���������䣺");
		String age = sc.nextLine();
		System.out.println("�������Ա�");
		String sex = sc.nextLine();
		System.out.println("���������֤�ţ�");
		String id = sc.nextLine();
		System.out.println("������绰��");
		String tel = sc.nextLine();
		System.out.println("������ӦƸְλ��");
		String post = sc.nextLine();
		
		employee e = new employee();
		e.setName(name);
		e.setAge(age);
		e.setSex(sex);
		e.setId(id);
		e.setTel(tel);
		e.setPost(post);
		
		array.add(e);
		
		System.out.println("��ӳɹ���");
		
	}

	public static void delet(ArrayList<employee> array) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��������ɾ����Ϣ�ĵ绰���룺");
		String tel = sc.nextLine();
		int index = -1;
		for(int  i = 0; i < array.size(); i ++ )
		{
			employee e = array.get(i);
			if(e.getTel().equals(tel))
			{
				index = i;
				break;
			}
			
		}
		
		if(index == -1)
		{
			System.out.println("�õ绰�����ڣ����������룡");
		}
		else {
			array.remove(index);
			System.out.println("ɾ���ɹ���");
		}
	}
	
	public static void update(ArrayList<employee> array) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��������Ҫ�޸���Ϣ�˵ĵ绰���룺");
		String tel = sc.nextLine();
		System.out.println("��������Ҫ�޸���Ϣ�˵���������");
		String name = sc.nextLine();
		System.out.println("��������Ҫ�޸���Ϣ�˵������䣺");
		String age = sc.nextLine();
		System.out.println("��������Ҫ�޸���Ϣ�˵����Ա�");
		String sex = sc.nextLine();
		System.out.println("��������Ҫ�޸���Ϣ�˵������֤�ţ�");
		String id = sc.nextLine();
		System.out.println("��������Ҫ�޸���Ϣ�˵���ӦƸְλ��");
		String post = sc.nextLine();
		
		employee e = new employee();
		e.setName(name);
		e.setAge(age);
		e.setSex(sex);
		e.setId(id);
		e.setTel(tel);
		e.setPost(post);
		
		for(int i = 0; i < array.size(); i ++ )
		{
			employee e1 = array.get(i);
			if(e1.getTel().equals(tel))
			{
				array.set(i, e);
				break;
			}
		}
		System.out.println("�޸ĳɹ���");
		
	}

	public static void disply(ArrayList<employee> array) {
		if(array.size() == 0)
		{
			System.out.println("����Ϣ��");
			return;
		}
		
		System.out.println("����\t����\t�Ա�\t���֤��\t�绰\tӦƸְλ");
		for(int i = 0; i < array.size(); i ++ )
		{
			employee e = array.get(i);
			System.out.println(e.getName() + "\t" + e.getAge() + "��\t" + e.getSex() + "\t" + e.getId() + "\t" + e.getTel() + "\t" + e.getPost());
		}
	}
}
