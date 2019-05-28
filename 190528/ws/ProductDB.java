package ws;

import java.util.ArrayList;

public class ProductDB extends DB<Product,Integer>{

	@Override
	public void insert(Product obj) {
		System.out.println(obj.id+" "+obj.name+" "+obj.price+" inserted...");
	}

	@Override
	public Product select(Integer obj) {
		Product p = null;
		System.out.println("Search: "+obj);
		p = new Product(1111, "pants", 10000);
		return p;
	}

	@Override
	public ArrayList<Product> select() {
		ArrayList<Product> list = new ArrayList<>();
		list.add(new Product(1111,"pants  ",10000));
		list.add(new Product(2222,"hat    ",20000));
		list.add(new Product(3333,"t-shirt",30000));
		list.add(new Product(4444,"bag    ",40000));
		list.add(new Product(5555,"shoes  ",50000));
		return list;
	}

	@Override
	public void update(Product obj) {
		System.out.println(obj+" updated...");
		
	}

	@Override
	public void delete(Integer obj) {
		System.out.println(obj+" deleted...");
		
	}

}
