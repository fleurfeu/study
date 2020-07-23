import java.util.ArrayList;
import java.util.Scanner;

public class HRS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<employee> array = new ArrayList<>();
		while(true) {
			
			System.out.println("——————欢迎进入招聘系统——————");
			System.out.println("1 添加个人信息");
			System.out.println("2 删除个人信息");
			System.out.println("3 修改个人信息");
			System.out.println("4 查看所有信息");
			System.out.println("5 退出");
			System.out.println("请输入你的选择");
			
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
				System.out.println("谢谢使用该系统！");
				//break;
				System.exit(0);
			
			}
		}
		
	}
	
	public static void add(ArrayList<employee> array) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入姓名：");
		String name = sc.nextLine();
		System.out.println("请输入年龄：");
		String age = sc.nextLine();
		System.out.println("请输入性别：");
		String sex = sc.nextLine();
		System.out.println("请输入身份证号：");
		String id = sc.nextLine();
		System.out.println("请输入电话：");
		String tel = sc.nextLine();
		System.out.println("请输入应聘职位：");
		String post = sc.nextLine();
		
		employee e = new employee();
		e.setName(name);
		e.setAge(age);
		e.setSex(sex);
		e.setId(id);
		e.setTel(tel);
		e.setPost(post);
		
		array.add(e);
		
		System.out.println("添加成功！");
		
	}

	public static void delet(ArrayList<employee> array) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入需删除信息的电话号码：");
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
			System.out.println("该电话不存在，请重新输入！");
		}
		else {
			array.remove(index);
			System.out.println("删除成功！");
		}
	}
	
	public static void update(ArrayList<employee> array) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入需要修改信息人的电话号码：");
		String tel = sc.nextLine();
		System.out.println("请输入需要修改信息人的新姓名：");
		String name = sc.nextLine();
		System.out.println("请输入需要修改信息人的新年龄：");
		String age = sc.nextLine();
		System.out.println("请输入需要修改信息人的新性别：");
		String sex = sc.nextLine();
		System.out.println("请输入需要修改信息人的新身份证号：");
		String id = sc.nextLine();
		System.out.println("请输入需要修改信息人的新应聘职位：");
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
		System.out.println("修改成功！");
		
	}

	public static void disply(ArrayList<employee> array) {
		if(array.size() == 0)
		{
			System.out.println("无信息！");
			return;
		}
		
		System.out.println("姓名\t年龄\t性别\t身份证号\t电话\t应聘职位");
		for(int i = 0; i < array.size(); i ++ )
		{
			employee e = array.get(i);
			System.out.println(e.getName() + "\t" + e.getAge() + "岁\t" + e.getSex() + "\t" + e.getId() + "\t" + e.getTel() + "\t" + e.getPost());
		}
	}
}
