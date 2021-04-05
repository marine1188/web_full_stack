package quiz.Abstract.two;

public class Bicycle extends Trans {
	
	// ������
	Bicycle(){
		super.name = "������";
	}
	
	//
	@Override
	public void start() {
		System.out.println(name + " ����մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println(name + " ������ϴ�.");
	}
}// Bicycle
