package com.sds.component;

import java.util.ArrayList;

import com.sds.frame.Dao;
import com.sds.vo.Product;
import com.sds.vo.User;

public class ProductDao extends Dao<Integer, Product> {

	@Override
	public void insert(Product v) throws Exception {
		if(v.getId()==2222) {
			throw new Exception("E0001");//return 없어도 밑의 문장 실행 X
		}
		System.out.println(v+" Inserted...");
		
	}

	@Override
	public void delete(Integer k) throws Exception {
		System.out.println(k+" Deleted...");
	}

	@Override
	public void update(Product v) throws Exception {
		if(v.getId()==3333){
			throw new Exception("E0003");//return 없어도 밑의 문장 실행 X
		}
		System.out.println(v+" Updated...");

	}

	@Override
	public Product select(Integer k) throws Exception {
		Product product = new Product(k,"pants",10000);
		return product;
	}

	@Override
	public ArrayList<Product> select() throws Exception {
		ArrayList<Product> list = new ArrayList<>();
		list.add(new Product(1111,"pants",10000));
		list.add(new Product(2222,"shirt",20000));
		list.add(new Product(3333,"skirt",30000));
		list.add(new Product(4444,"socks",40000));
		list.add(new Product(5555,"shoes",50000));
		return list;
	}

}
