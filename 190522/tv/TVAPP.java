package tv;

public class TVAPP {//걍 어플리케이션 아무데서나 사용 ok

	public static void main(String[] args) {
		TV tv;//class instance // reference type variable
		tv = new TV();//TV생성
		System.out.println(tv.toString());
		tv.power = true;
		tv.channel = 11;
		System.out.println(tv.toString());
		tv.power();
		System.out.println(tv.toString());
		tv.ChannelDown();
		System.out.println(tv.toString());
		
		TV tv2 = new TV("blue",false,9);
		System.out.println(tv2.toString());
		TV tv3 = new TV("green");

	}

}
