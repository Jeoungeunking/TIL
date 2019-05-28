package db;

public class ProductDao extends Dao {
	
	public ProductDao(String ip) {
		super(ip);
	}

	@Override
	public Object select(Object o) {
		Product p = null;
		String str = (String)o;
		p = new Product("p01","pants",10000);
		return p;
		
	}

	@Override
	public void insert(Object o) {
		connection();
		Product p = (Product)o;
		System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice()+"Inserted...");
		close();

	}

	@Override
	public void delete(Object o) {
		String str = (String)o;
		connection();
		System.out.println(str+" Deleted...");
		close();
	}

}
