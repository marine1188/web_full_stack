package quiz02;

public class Biclycle extends Trans {
	String name = null;
	
	public void start(String name) {
		System.out.println( name +"출발 합니다");
	}
	public void stop(String name) {
		System.out.println( name +"정지 합니다");
	}

}
