package set;

import java.util.ArrayList;

public class ListTest2 {

	public static void main(String[] args) {
		ArrayList<User> list = new ArrayList<>();//사이즈 결정X 편하당.&&Generic이라 typecasting 필요X
		list.add(new User("id01", "james", "psd01"));
		list.add(new User("id02", "james", "psd02"));
		list.add(new User("id03", "james", "psd03"));
		list.add(new User("id04", "james", "psd04"));
		list.add(new User("id05", "james", "psd05"));
		
		list.remove(3);//잘 사용하지 않는다. 한번에 넣었다가 한번에 꺼낼때 주로 사용.
		for(User i:list) {
		System.out.println(i);
		}
		



	}

}
