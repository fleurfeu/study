package LogIn;


public class pinjiezifuchuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3};
		String s = arraytoString(arr);
		
		System.out.println("s:" + s);


	}
	public static String arraytoString(int[] arr)
	    {
	    	String s = "";
	    	s += "[";
	    	for(int i = 0; i < arr.length; i ++ )
	    	{
	    		if(i == arr.length - 1) s += arr[i];
	    		else s+= arr[i] + ", ";
	    	}
	    	s += "]";
	    	return s;
	    }
}
