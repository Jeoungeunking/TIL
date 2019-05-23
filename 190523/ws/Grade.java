package ws;

public class Grade {
	private static final char A = 0;
	private static final char B = 0;
	private static final char C = 0;
	private static final char D = 0;
	private static final char F = 0;
	private int[] a;

	public Grade(int a[]) {
		this.a = a;
	}
	public static int sum(int a[]) {
		int sum =0;
		for(int data: a){
			sum += data;
		}
		return sum;
	}
	public static double avg(int a[]) {
		return (sum(a)/a.length);
	}
	public static String abc(int a[]) {
		if(avg(a)>=90) {
			return "A";
		}else if(avg(a)>=80) {
			return "B";
		}else if(avg(a)>=70) {
			return "C";
		}else if(avg(a)>=60) {
			return "D";
		}else return "F";
		
	}
	public static int Max(int a[]) {
		int temp = a[0];
		for(int data: a) {
			if(temp<data) temp = data;
		}
		return temp;
	}
	public static int Min(int a[]) {
		int temp = a[0];
		for(int data: a) {
			if(temp>data) temp = data;
		}
		return temp;
	}
	public static int[] asort(int a[]) {// 리턴 타입이 배열
		 for(int i=0;i<a.length;i++) {
	            for(int j=0; j<a.length-1-i;j++) {
	                if(a[j+1]>a[j]) {
	                    int temp = a[j];
	                    a[j]=a[j+1];
	                    a[j+1]=temp;
	                    
	                }
	            }
	        }
		return a;
		
	}
	public static int[] dsort(int a[]) {
		for(int i=0;i<a.length;i++) {
           for(int j=0; j<a.length-1-i;j++) {
               if(a[j+1]<a[j]) {
                   int temp = a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
                   
               }
           }
       }
	return a;
	}

}
