package homework;
//¹®Á¦3] 1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8 + 9/10 = ?
public class Ex03_Homework {
	 public static void main(String[] args) {
		double hap = 0;
		
		for(int i=1; i < 10 ; i++) {
			hap +=  i / (i + 1.0) ;
		} // for end
		
		System.out.printf(" 1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8 + 9/10 = %.2f" , hap );
	}
}
