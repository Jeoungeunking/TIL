package stat;

public class CalcTest {
	public static void main(String[] args) {
		int a=10, b=10;
		int sum=0;
		sum = Calc.sum(a,b);//Calc클래스의 static sum 사용
		int datas[] = {1,2,3,4,5};
		int sums = Calc.sum(datas);
	}
	

}
