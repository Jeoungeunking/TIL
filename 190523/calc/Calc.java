package calc;

public class Calc {
	private int [] data;
	

	public Calc(int[] data) {
		this.data = data;
	}
	//1. Sum
	public int sum(int a[]) {
		int sum =0;
		for(int data: a){
			sum += data;
		}
		return sum;
	}
	public double avg(int a[]) {
		return (sum(a)/a.length);
	}
	//2. Sort Asc
	public int[] asort(int a[]) {// 리턴 타입이 배열
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
	//3. Sort Desc
	public int[] dsort(int a[]) {
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