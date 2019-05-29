package com.sds.frame;

import java.util.ArrayList;

public abstract class Dao<K,V> {
	public abstract void insert(V v) 
			throws Exception;//예외 발생할 수 있다.
	public abstract void delete(K k) 
			throws Exception;
	public abstract void update(V v) 
			throws Exception;//모든 정보 띄운 뒤 수정
	public abstract V select(K k) 
			throws Exception;
	public abstract ArrayList<V> select() 
			throws Exception;

}
