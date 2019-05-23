package car;

public class carTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car cars[] = new Car[3];
		cars[0] = new Car("k1","yellow",60,90);
		cars[1] = new Car("k2","blue",70,100);
		cars[2] = new Car("k3","Red",80,80);
		for(Car c:cars) {//확장배열
			try {
				c.setCfSize(70);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(c.getName()+" "+
				"Too Much Fuel Size..");
			}
			System.out.println(c);
		}


	}

}
