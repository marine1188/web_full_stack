package homework;
//����2] (-1) + 2 + (-3) + 4 + (-5) + ... + (-9) + 10 = ?
public class Ex02_Homework {
	public static void main(String[] args) {
		
		int num = 1, sum = 0, flag = -1;  // ���� �ʱ�ȭ
		
		while( num <= 10 ) {  // ����
			
			if( num % 2 != 0 ) sum += ( num * flag );
			else   sum += num;
			
			num++;  // ������
		} // while end
		
		System.out.println("(-1) + 2 + (-3) + 4 + (-5) + ... + (-9) + 10 =" + sum);
	}
}
