package quiz.Abstract.one;

public class Airplane extends Transport {

	@Override
	public void start(String trpt) {
		start = "�̷��մϴ�.";
	}

	@Override
	public void stop(String trpt) {
		stop = "��õ���׿� �����մϴ�.";
	}

	@Override
	public void display(String trpt) {
		System.out.println(trpt + "�� " + start + "\t" + trpt + "�� " + stop);
	}

}
