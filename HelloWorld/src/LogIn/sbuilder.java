package LogIn;

public class sbuilder {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		StringBuilder str1 = new StringBuilder();
		str1.append("helloo");
		
		//��ʽ���
		str.append("hello").append(" world").append(" java ").append(100);
		System.out.println(str);
		
		str.reverse();
		System.out.println(str);
		
		//stringbuilderת��Ϊstring
		String s = str1.toString();
		System.out.println(s);
		
		//stringת��Ϊstringbuilder
		String s1 = "heello";
		StringBuilder str3 = new StringBuilder(s1);
		System.out.println(str3);
		
	}

}
