package LogIn;

public class sbuilder {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		StringBuilder str1 = new StringBuilder();
		str1.append("helloo");
		
		//链式编程
		str.append("hello").append(" world").append(" java ").append(100);
		System.out.println(str);
		
		str.reverse();
		System.out.println(str);
		
		//stringbuilder转换为string
		String s = str1.toString();
		System.out.println(s);
		
		//string转换为stringbuilder
		String s1 = "heello";
		StringBuilder str3 = new StringBuilder(s1);
		System.out.println(str3);
		
	}

}
