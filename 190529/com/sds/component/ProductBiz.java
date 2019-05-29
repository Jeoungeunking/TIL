package com.sds.component;

import java.util.ArrayList;

import com.sds.frame.Biz;
import com.sds.frame.Dao;
import com.sds.vo.Product;

public class ProductBiz extends Biz<Integer, Product> {
	
	Dao<Integer, Product> dao;
	public ProductBiz() {
		dao = new ProductDao();
	}
	@Override
	public void register(Product v) throws Exception {
		checkData(v);
		transactionStart();
		try {
		dao.insert(v);
		//예외 발생 후 transactionEnd가 실행되지 않는다면, 프로그램이 끝나지 않은 것.
		//비정상적인 프로그램 종료 발생. 서버는 예외발생을 모른다.
		}catch(Exception e) {
		throw e;
		}finally {//마지막에 이거 실행해라(정상||비정상)모두 실행.
		transactionEnd();
		}
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		System.out.println(k+ "Removed...");
	}

	@Override
	public void modify(Product v) throws Exception {
		checkData(v);
		transactionStart();
		try {
		dao.update(v);
		}catch(Exception e) {
		throw e;
		}finally {
		transactionEnd();
		}
		
	}

	@Override
	public Product get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public ArrayList<Product> get() throws Exception {
		return dao.select();
	}

}
