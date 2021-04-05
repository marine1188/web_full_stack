package homework;
//¹®Á¦1] 1 + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4) + (1 + 2 + 3 + 4 + 5) = ?
public class Ex01_Homework {
	public static void main(String[] args) {
		int num = 0, sum=0,  total =0;
		
		do {
			num++;
			sum += num;   //sum = sum + num;
			total += sum;  //total = total + sum;
		} while( num < 5 );
		
		System.out.println("1 + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4) + (1 + 2 + 3 + 4 + 5) =" + total);
	}
}
