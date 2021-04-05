package quiz.Abstract.one;

public class Bus extends Transport {

	@Override
	public void start(String trpt) {
		start = "�������� ����մϴ�.";
	}

	@Override
	public void stop(String trpt) {
		stop = "�����忡 ���ɴϴ�.";
	}

	@Override
	public void display(String trpt) {
		System.out.println(trpt + "�� " + start + "\t" + trpt + "�� " + stop);
	}

}
