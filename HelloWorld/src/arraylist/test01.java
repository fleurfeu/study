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
		
		//ɾ��ָ��Ԫ�أ������Ƿ�ɾ���ɹ�
		//System.out.println(array.remove("hello"));
		//System.out.println(array.remove(0));
		
		//�޸�ָ��λ�õ�Ԫ�ص�ֵ�����ر��޸ĵ�Ԫ��
		System.out.println(array.set(1, "mars"));
		
		//����ָ����������Ԫ��
		System.out.println(array.get(3));
		
		//���ؼ���Ԫ�ظ���
		System.out.println(array.size());
		
		System.out.println(array);

	}
	
	

}
