package arraylist;

import java.util.ArrayList;

import javax.swing.plaf.InputMapUIResource;

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������
		ArrayList<String> array = new ArrayList<>();
		
		//����ַ���
		array.add("born");
		array.add("to");
		array.add("love");
		
		//����
		//System.out.println(array.get(0));
		//System.out.println(array.get(1));
		//System.out.println(array.get(2));
		
		for(int i = 0; i < array.size(); i ++ )
			System.out.println(array.get(i));

	}

}
