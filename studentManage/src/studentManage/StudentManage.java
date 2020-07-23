package studentManage;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������϶������ڴ洢ѧ����Ϣ
		ArrayList<Student> array = new ArrayList<>();
		
		while (true) {
			System.out.println("��������������ӭ����ѧ������ϵͳ������������");
			System.out.println("1 ���ѧ��");
			System.out.println("2 �޸�ѧ��");
			System.out.println("3 ɾ��ѧ��");
			System.out.println("4 �鿴����ѧ��");
			System.out.println("5 �˳�");
			System.out.println("���������ѡ��");
			
			Scanner sc = new Scanner(System.in);
			int choose = sc.nextInt();
			
			switch (choose) {
			case 1:
				//System.out.println("���ѧ��");
				addStudent(array);
				break;
			case 2:
				//System.out.println("�޸�ѧ��");
				updateStudent(array);
				break;
			case 3:
				//System.out.println("ɾ��ѧ��");	
				deleteStudent(array);
				break;
			case 4:
				//System.out.println("�鿴����ѧ��");
				findAllStudent(array);
				break;
			case 5:
				System.out.println("ллʹ�ã�");
				//break;
				System.exit(0);//JVM�˳�
				
			}
			
			
		}
		
		
		
	}
	

	public static void addStudent(ArrayList<Student> array) {

		Scanner sc = new Scanner(System.in);
		String sid;
		while(true) {
			System.out.println("������ѧ��ѧ�ţ�");
			sid = sc.nextLine();
			
			boolean flag = isUesd(array, sid);
			
			if(flag)
			{
				System.out.println("��ѧ���ѱ�ʹ�ã����������룡");
			}
			else break;
		}
		System.out.println("������ѧ��������");
		String name = sc.nextLine();
		System.out.println("������ѧ�����䣺");
		String age = sc.nextLine();
		System.out.println("������ѧ����ס�أ�");
		String address = sc.nextLine();
		
		//����ѧ�����󣬰Ѽ���¼������ݸ�ֵ��ѧ������ĳ�Ա����
		Student s = new Student();
		s.setSid(sid);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
		
		//��ѧ��������ӵ�������
		array.add(s);
		
		System.out.println("���ѧ���ɹ���");
	}
	
	//�ж�ѧ���Ƿ�ʹ��
	public static boolean isUesd(ArrayList<Student> array, String sid) {
		boolean flag = false;
		
		for(int i = 0; i < array.size(); i ++ )
		{
			Student s = array.get(i);
			if(s.getSid().equals(sid))
			{
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public static void findAllStudent(ArrayList<Student> array) {
		if(array.size() == 0) System.out.println("����Ϣ���������Ϣ���ٲ�ѯ��");
		//����else����if�������� return��
		else {
			//��ʾ��ͷ��Ϣ
			System.out.println("ѧ��\t����\t����\t��ס��");
			
			//ȡ�������е����ݲ���ʾ
			for(int i = 0; i < array.size(); i ++ )
			{
				Student s = array.get(i);
				System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "��\t" + s.getAddress() + "\t");
			}
		}
		
	}

	public static void deleteStudent(ArrayList<Student> array) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������Ҫɾ��ѧ����ѧ��");
		String sid = sc.nextLine();
		
		int index = -1;
		for(int i = 0; i < array.size(); i ++ )
		{
			Student s = array.get(i);
			if(s.getSid().equals(sid))
			{
				index = i;
				break;
			}
		}
		
		if(index == -1) System.out.println("����Ϣ�����ڣ����������롣");
		else 
		{
			array.remove(index);
			System.out.println("�ѳɹ�ɾ����");
		}
		
		
	}

	public static void updateStudent(ArrayList<Student> array) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��������Ҫ�޸�ѧ����ѧ�ţ�");
		String sid = sc.nextLine();
		System.out.println("��������Ҫ�޸�ѧ����������");
		String name = sc.nextLine();
		System.out.println("��������Ҫ�޸�ѧ�������䣺");
		String age = sc.nextLine();
		System.out.println("��������Ҫ�޸�ѧ���¾�ס�أ�");
		String address = sc.nextLine();
		
		//����ѧ������
		Student s = new Student();
		s.setSid(sid);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
		
		//�����޸Ķ�Ӧѧ������Ϣ
		for(int i = 0; i < array.size(); i ++ )
		{
			Student s1 = array.get(i);
			if(s1.getSid().equals(sid)) {
				array.set(i, s);
				break;
			}
		}
		System.out.println("�޸�ѧ���ɹ���");
	}
}
