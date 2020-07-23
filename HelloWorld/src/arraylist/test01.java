package arraylist;

import java.util.ArrayList;



public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> array = new ArrayList<>();
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add(1,"good");
		
		//删除指定元素，返回是否删除成功
		//System.out.println(array.remove("hello"));
		//System.out.println(array.remove(0));
		
		//修改指定位置的元素的值，返回被修改的元素
		System.out.println(array.set(1, "mars"));
		
		//返回指定索引处的元素
		System.out.println(array.get(3));
		
		//返回集合元素个数
		System.out.println(array.size());
		
		System.out.println(array);

	}
	
	

}
