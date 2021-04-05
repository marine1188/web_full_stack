package quiz.Abstract.one;

public class Bicycle extends Transport {

	@Override
	public void start(String trpt) {
		start = "�޸��� �����մϴ�.";
	}

	@Override
	public void stop(String trpt) {
		stop = "���� �ϰ� ����ϴ�.";
	}

	@Override
	public void display(String trpt) {
		System.out.println(trpt + "�� " + start + "\t" + trpt + "�� " + stop);
	}

}
