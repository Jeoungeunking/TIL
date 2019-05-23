package stat;

public class Calc {
	public static int sum(int a, int b) {// 멤버 variable 존재 X 기능만 사용할꺼야!static!
		return (a+b);
	}
	public static int sum(int a[]) {//배열 들어오면 가변적!
		int sum =0;
		for(int data: a){
			sum += data;
		}
		return sum;
	}
}
