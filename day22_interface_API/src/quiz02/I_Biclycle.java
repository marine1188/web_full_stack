package quiz02;

public interface I_Biclycle  {
	String name = null;
	
	public static void start(String name) {
		System.out.println( name +"출발 합니다");
	}
	public static void stop(String name) {
		System.out.println( name +"정지 합니다");
	}

}
