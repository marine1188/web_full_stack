package ex04.userException;

public class UserException extends Exception {

	private int port = 772;

	public UserException(String msg) {
		super(msg);
	}

	public UserException(String msg, int port) {
		super(msg);
		this.port = port;
	}

	public int getPort() {
		return port;
	}

	public void test1(String[] args) {
		// TODO Auto-generated method stub
		
	}
}