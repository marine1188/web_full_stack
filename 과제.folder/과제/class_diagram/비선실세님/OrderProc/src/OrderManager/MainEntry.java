package OrderManager;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		OrderUI UI = new OrderUI();
		while(true){
			System.out.println(">>>>>>>>>>>>> �ֹ� ���� ���α׷�  <<<<<<<<<<<");
			System.out.println("�޴��� �����ϼ���.");
			System.out.println("1.ȸ�������Է� 2.�ֹ��Է� 3.�ֹ���� 4.�ֹ����  5.��ü�ֹ�Ȯ��  6.ȸ�����ֹ� Ȯ��  7.����");
			
			switch(new Scanner(System.in).nextInt())
			{
			case 1:				
				while(true)
				{					
					UI.InsertCustomer();	
					System.out.println("�ٽ��Է�??(y/n)");
					String str = new Scanner(System.in).nextLine();
					if(str.equals("n")||str.equals("N")){
						UI.AddCustem();
						break;
					}
				}				
				break;
			case 2: 
				while(true)
				{					
					UI.InsertOrder();	
					System.out.println("�ٽ��Է�??(y/n)");
					String str = new Scanner(System.in).nextLine();
					if(str.equals("n")||str.equals("N")){
						
						break;
					}
				}		
				break;
			case 3:
				UI.AddOrder();
				break;
			case 4: 		
				System.out.println("����� �ֹ���ȣ�� �Է�:");
				int nNumber = new Scanner(System.in).nextInt();
				UI.cancelOrder(nNumber);
				break;
			case 5:
				UI.PrintALLOrder();				
				break;
			case 6:
				System.out.println("Ȯ���� ȸ����ȣ�� �Է�:");
				int nNum = new Scanner(System.in).nextInt();
				UI.CustemOrderPrint(nNum);				
				break;
			case 7:
				System.out.println("�����ϼ̽��ϴ�.");
				System.exit(-1);
				default : //�߸��Է�
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է� ���ּ���");
					continue;
			}			
			
		}
	
	}
}
