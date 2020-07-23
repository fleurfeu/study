package studentManage;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建集合对象，用于存储学生信息
		ArrayList<Student> array = new ArrayList<>();
		
		while (true) {
			System.out.println("——————欢迎来到学生管理系统——————");
			System.out.println("1 添加学生");
			System.out.println("2 修改学生");
			System.out.println("3 删除学生");
			System.out.println("4 查看所有学生");
			System.out.println("5 退出");
			System.out.println("请输入你的选择");
			
			Scanner sc = new Scanner(System.in);
			int choose = sc.nextInt();
			
			switch (choose) {
			case 1:
				//System.out.println("添加学生");
				addStudent(array);
				break;
			case 2:
				//System.out.println("修改学生");
				updateStudent(array);
				break;
			case 3:
				//System.out.println("删除学生");	
				deleteStudent(array);
				break;
			case 4:
				//System.out.println("查看所有学生");
				findAllStudent(array);
				break;
			case 5:
				System.out.println("谢谢使用！");
				//break;
				System.exit(0);//JVM退出
				
			}
			
			
		}
		
		
		
	}
	

	public static void addStudent(ArrayList<Student> array) {

		Scanner sc = new Scanner(System.in);
		String sid;
		while(true) {
			System.out.println("请输入学生学号：");
			sid = sc.nextLine();
			
			boolean flag = isUesd(array, sid);
			
			if(flag)
			{
				System.out.println("该学号已被使用，请重新输入！");
			}
			else break;
		}
		System.out.println("请输入学生姓名：");
		String name = sc.nextLine();
		System.out.println("请输入学生年龄：");
		String age = sc.nextLine();
		System.out.println("请输入学生居住地：");
		String address = sc.nextLine();
		
		//创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
		Student s = new Student();
		s.setSid(sid);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
		
		//将学生对象添加到集合中
		array.add(s);
		
		System.out.println("添加学生成功！");
	}
	
	//判断学号是否被使用
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
		if(array.size() == 0) System.out.println("无信息，请添加信息后再查询！");
		//不用else就在if语句里添加 return；
		else {
			//显示表头信息
			System.out.println("学号\t姓名\t年龄\t居住地");
			
			//取出集合中的数据并显示
			for(int i = 0; i < array.size(); i ++ )
			{
				Student s = array.get(i);
				System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "岁\t" + s.getAddress() + "\t");
			}
		}
		
	}

	public static void deleteStudent(ArrayList<Student> array) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入要删除学生的学号");
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
		
		if(index == -1) System.out.println("该信息不存在，请重新输入。");
		else 
		{
			array.remove(index);
			System.out.println("已成功删除！");
		}
		
		
	}

	public static void updateStudent(ArrayList<Student> array) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入需要修改学生的学号：");
		String sid = sc.nextLine();
		System.out.println("请输入需要修改学生新姓名：");
		String name = sc.nextLine();
		System.out.println("请输入需要修改学生新年龄：");
		String age = sc.nextLine();
		System.out.println("请输入需要修改学生新居住地：");
		String address = sc.nextLine();
		
		//创建学生对象
		Student s = new Student();
		s.setSid(sid);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
		
		//遍历修改对应学生的信息
		for(int i = 0; i < array.size(); i ++ )
		{
			Student s1 = array.get(i);
			if(s1.getSid().equals(sid)) {
				array.set(i, s);
				break;
			}
		}
		System.out.println("修改学生成功！");
	}
}
