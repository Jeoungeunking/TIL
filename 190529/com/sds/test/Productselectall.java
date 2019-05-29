package com.sds.test;

import java.util.ArrayList;

import com.sds.component.ProductBiz;
import com.sds.frame.Biz;
import com.sds.vo.Product;

public class Productselectall {
	public static void main(String[] args) {
		Biz<Integer, Product> biz = new ProductBiz();
		ArrayList<Product> list = null;
		try {
			list = biz.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Product p: list) {
			System.out.println(p);
		}
		try {
			biz.remove(1111);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
