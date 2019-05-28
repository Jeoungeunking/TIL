package ws;

import java.util.ArrayList;

public abstract class DB <T,U>{
	
	public abstract void insert(T obj);
	public abstract T select(U obj);
	public abstract ArrayList<T> select();
	public abstract void update(T obj);
	public abstract void delete(U obj);

}
