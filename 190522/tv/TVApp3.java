package tv;

public class TVApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tvs[] = new TV[3];
		tvs[0] = new TV("red");
		tvs[1] = new TV("blue");
		tvs[2] = new TV("green");
		
		for(int i=0; i<tvs.length;i++) {
			System.out.println(tvs[i].toString());
		}
		for(TV tv:tvs) {//for(형식 이름:배열)
			System.out.println(tv.toString());
		}

	}

}
