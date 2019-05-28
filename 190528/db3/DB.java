package db3;

public abstract class DB<T,U> {
	
	public abstract void insert(T obj);//여기 user 들어가!
	public abstract T select(U obj);//여기는 user U는 string~

	

}
