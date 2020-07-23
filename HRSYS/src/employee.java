
public class employee {
	String name;
	String age;
	String sex;
	String id;
	String tel;
	String post;
	
	public employee() {
		// TODO Auto-generated constructor stub
	}
	
	public employee (String name, String age, String sex, String id, String tel, String post) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.id = id;
		this.tel = tel;
		this.post = post;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAge() {
		return age;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSex() {
		return sex;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getTel() {
		return tel;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getPost() {
		return post;
	}

}
