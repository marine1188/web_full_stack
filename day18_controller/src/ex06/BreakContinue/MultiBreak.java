package ex06.BreakContinue;

public class MultiBreak {
	public static void main(String[] args) {
		boolean flag = true;
		
		firust: {
			second : {
				third : {
						int k = 100;
						System.out.println("Before the break");
						if( flag ) break second;    // break �ĺ���;    �ĺ��� ��ġ���� Ż��
						System.out.println("This won't execute ");
				} // end third
				System.out.println("th1 �츮�� ȱ��!!!");
			} // end second
			System.out.println("This is after second block");
		} // end firust
		
		System.out.println("����� ��� �� ���Դϴ�.");
	}
}
