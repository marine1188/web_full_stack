package quiz.Abstract.two;

public class Subway extends Trans{
	
	// ������
	Subway(){
		super.name = "����ö";
	}
	
	//
	@Override
	public void start(){
		System.out.println("���� ����մϴ�.");
	}
	@Override
	public void stop(){
		System.out.println("���� �����߽��ϴ�.");
	}
}// Subway
