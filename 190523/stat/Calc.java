package stat;

public class Calc {
	public static int sum(int a, int b) {// ��� variable ���� X ��ɸ� ����Ҳ���!static!
		return (a+b);
	}
	public static int sum(int a[]) {//�迭 ������ ������!
		int sum =0;
		for(int data: a){
			sum += data;
		}
		return sum;
	}
}
