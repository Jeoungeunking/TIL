package ws;

public class App {
	public static void main(String[] args) {
		DB<Product,Integer> db = new ProductDB();//DB�� <,>�̷��� ���ڴ� �����ʿ�.
		db.insert(new Product(100,"T",10000));
		Product p = db.select(100);
		System.out.println(p);
	}
}
