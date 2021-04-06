package ex04.userException;

public class MainEntry {

	public void test11(String[] n) throws UserException{
		// TODO Auto-generated method stub
		System.out.println("Test1");
		if (n.length < 1)
			throw new UserException("아무것도 없다네"); // 강제 exception 발생
		else
			throw new UserException("최종 예선", 703); // 강제 exception 발생
	}

	public static void main(String[] args) {
		MainEntry ut = new MainEntry();
		try {
			ut.test11(args);
		} catch (UserException ue) {
			// System.out.println(ue.getMessage());
			ue.printStackTrace();
		}
	}

	private void test1(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
