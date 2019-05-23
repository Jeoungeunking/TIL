package ws;

import java.util.Arrays;
import java.util.Scanner;

import calc.Calc;

public class GradeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("네 과목의 점수를 입력하세요:국어, 영어, 수학, 과학");
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int a[] = {b,c,d,e};
		
		System.out.println(Grade.sum(a));
		System.out.println(Grade.avg(a));
		System.out.println(Grade.abc(a));
		System.out.println(Grade.Max(a));
		System.out.println(Grade.Min(a));
		System.out.println(Arrays.toString(Grade.asort(a)));
		System.out.println(Arrays.toString(Grade.dsort(a)));
	}

}
