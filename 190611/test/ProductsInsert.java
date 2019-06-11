package test;

import com.ProductsBiz;

import frame.Biz;
import vo.Factory;
import vo.Products;

public class ProductsInsert {

	public static void main(String[] args) {
		long milis = System.currentTimeMillis();
		java.sql.Date d = new java.sql.Date(milis);
		Products p = new Products(19,"ÇÚµåÆù","°¶·°19","3333",d,1800,2100000,44);
		Biz<Integer, Products> biz = new ProductsBiz();
		try {
			biz.register(p);
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
