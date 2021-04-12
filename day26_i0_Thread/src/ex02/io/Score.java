package ex02.io;

import java.io.Serializable;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Score implements Serializable {
	// 넣었던 순서되로 꺼낼수 있다
	private String subject; // 과목
	private int su;// 점수

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getSu() {
		return su;
	}

	public void setSu(int su) {
		this.su = su;
	}


	// 바로 출력 가능 하게
	@Override
	public String toString() {
		return "Score [subject=" + subject + ", su=" + su + "]";
	}

}
