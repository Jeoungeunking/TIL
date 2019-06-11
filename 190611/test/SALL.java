package test;

import java.util.ArrayList;

import com.ProductsBiz;

import frame.Biz;
import vo.Products;

public class SALL {
	public static void main(String[] args) {
		Biz<Integer, Products> biz = new ProductsBiz();
			ArrayList<Products> a;
			try {
				a = biz.get();
				for(Products u: a) {
					System.out.println(u);
			}
			}catch(Exception e){
				e.printStackTrace();
				
			}
	}

}
