package quiz02;

public abstract class Trans implements I_Biclycle,I_Plain,I_Subway,I_Trans  {

	
	String name = null;
	
	public abstract void start(String name);
	public abstract void stop(String name);

}
