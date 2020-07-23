package arraylist;


import java.util.ArrayList;

public class Student {
	
	private String name;
	private int age;
	
	public Student (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName() 
	{
		return name;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建集合对象
		ArrayList<Student> array = new ArrayList<>();
				
		//创建学生对象
		Student s1 = new Student("hcy", 30);
		Student s2 = new Student("perper", 2);
		Student s3 = new Student("judy", 0);
	
		//添加学生对象到集合中
		array.add(s1);
		array.add(s2);
		array.add(s3);
		
		//遍历集合
		for(int i = 0; i < array.size(); i ++ )
			System.out.println(array.get(i).getName() + "," + array.get(i).getAge());
		
	}

}
