package account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1 = null;
		try {
			acc1 =
			new Account("kim", "12345",10000);
			System.out.println(acc1);
			System.out.println(Account.cnt);//클래스 변수는 다이렉트로 접근 가능
			Account acc2 =
			new Account("Lee", "23456",20000);
			System.out.println(acc2);
			System.out.println(Account.cnt);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
