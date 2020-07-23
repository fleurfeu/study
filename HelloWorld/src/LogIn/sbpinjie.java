package LogIn;

public class sbpinjie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3};
		String str1 = arraytoString(arr);
		
		System.out.println(str1);
		
	}
	
	public static String arraytoString(int[] arr) {
		StringBuilder str = new StringBuilder();
		str.append("[");
		
		for(int i = 0; i < arr.length; i ++ )
		{
			if(i == arr.length - 1) str.append(arr[i]);
			else str.append(arr[i]).append(", ");
		}
		
		str.append("]");
		String str1 = str.toString();
		return str1;
	}

}
