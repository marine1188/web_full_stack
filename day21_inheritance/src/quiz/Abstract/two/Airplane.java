package quiz.Abstract.two;

public class Airplane extends Trans {
	
	// ������
	Airplane(){
		super.name = "�����";
	}

	//
	@Override
	public void start() {
		System.out.println(name + "�� �̷��մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println(name + "�� �����մϴ�.");
	}

}// Airplane
