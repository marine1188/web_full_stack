package quiz02;

public interface I_Plain  {
	String name = null;
	
	public static void start(String name) {
		System.out.println( name +"이륙 합니다");
	}
	public static void stop(String name) {
		System.out.println( name +"착륙 합니다");
	}

}

