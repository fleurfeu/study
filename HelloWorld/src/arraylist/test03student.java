package arraylist;

import java.util.ArrayList;

import constructor.Student;

public class test03student {
	
	private String name;
	private int age;
	
	public void Student (String name, int age) {
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
		//�������϶���
		ArrayList<Student> array = new ArrayList<>();
		
		//����ѧ������
		Student s1 = new Student();
		
		
		
	}

}
