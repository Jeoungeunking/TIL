package stat;

public class Test1 {
	static int temp =0;
	public static int max(int a, int b) {
		int max = 0;
		if(max<a) {
			max=a;
		}else {
			max=b;
		}
		return max;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		temp = max(a,b);//static area ������ static method, static varable ����
		System.out.println(temp);
		

	}

}
