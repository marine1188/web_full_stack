package quiz02;

public class Plain extends Trans {
	String name = null;
	
	public void start(String name) {
		System.out.println( name +"이륙 합니다");
	}
	public void stop(String name) {
		System.out.println( name +"착 합니다");
	}

}

