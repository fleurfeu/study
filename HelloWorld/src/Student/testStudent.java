package Student;

public class testStudent {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("lucy");
		s.setAge(11);
		
		System.out.println(s.getName());
		System.out.println(s.getAge());
		s.show();//仅仅对数据作展示
	}

}
