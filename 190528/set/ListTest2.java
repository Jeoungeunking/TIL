package set;

import java.util.ArrayList;

public class ListTest2 {

	public static void main(String[] args) {
		ArrayList<User> list = new ArrayList<>();//������ ����X ���ϴ�.&&Generic�̶� typecasting �ʿ�X
		list.add(new User("id01", "james", "psd01"));
		list.add(new User("id02", "james", "psd02"));
		list.add(new User("id03", "james", "psd03"));
		list.add(new User("id04", "james", "psd04"));
		list.add(new User("id05", "james", "psd05"));
		
		list.remove(3);//�� ������� �ʴ´�. �ѹ��� �־��ٰ� �ѹ��� ������ �ַ� ���.
		for(User i:list) {
		System.out.println(i);
		}
		



	}

}
