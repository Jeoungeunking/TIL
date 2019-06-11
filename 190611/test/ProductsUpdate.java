package test;

import com.ProductsBiz;

import frame.Biz;
import vo.Products;

public class ProductsUpdate {
		public static void main(String[] args) {
			Biz<Integer, Products> biz = new ProductsBiz();
			long milis = System.currentTimeMillis();
			java.sql.Date d = new java.sql.Date(milis);
			Products p = new Products(99,"핸드폰","갤노트","2222",d,10000,900000,100);
			try {
				biz.modify(p);
				System.out.println("Products Updated");
			}catch(Exception e){
				e.printStackTrace();
				
			}
	}

}
