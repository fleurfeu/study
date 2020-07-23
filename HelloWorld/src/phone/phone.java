package phone;

public class phone {
	String phone;
	int price;
	
	public void call(String name) {
		System.out.println("给"+name+"发短信");
	}
	
	public void sendMessage() {
		System.out.println("群发短信");
	}

}
