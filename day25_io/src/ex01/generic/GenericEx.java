package ex01.generic;

public class GenericEx<T> {
	T[] v;//멤버 변수
	
	public void set(T[]v)
	{
		this.v =v;
	}
	public void print() 
	{
		for (T item : v) {
			System.err.println(item);
		
		}
	}


}
