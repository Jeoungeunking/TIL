package ws;
public class Walking extends Transportation{

 @Override
 public int c_fee() {
  // TODO Auto-generated method stub
  return 0;
 }
 public Walking() {
	super();
	// TODO Auto-generated constructor stub
}

public Walking(int speed, String id, Point a, Point d) {
	super(speed, id, a, d);
	this.fee = 0;
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Walking [fee=" + fee + ", distance=" + distance + ", time=" + time + ", speed=" + speed + ", id=" + id
			+ ", a=" + a + ", d=" + d + "]";
}

 
}

