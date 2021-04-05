package ex06.BreakContinue;

public class MainEntry {
	public static void main(String[] args) {
		// break,  continue
		
//		for(int i = 1; i < 11; i++) {
//			if( i == 7 ) break;
//			System.out.println(i);
//		}
		
//		for(int i = 1; i < 11; i++) {
//			if( i == 7 ) continue;
//			System.out.println(i);
//		}
		
		for(int i = 1; i < 101; i++) {
			
			if( i % 2 != 0 ) continue;
			
			System.out.print(i + "\t");
			
			if( i % 20 == 0 ) System.out.println();
		}
		
		
	}
}





