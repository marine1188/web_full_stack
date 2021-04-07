package ex03.mutilmeplements;

import ex05.Abstract.Shape;

public class MainEntry {

	public static void main(String[] args) {
		   // TODO Auto-generated method stub
	
	      Shape s = new MultiClass();
	      s.show("kig");
	      s.view(); //
	      //s.draw(); 여러 부모를 만났을 경우 Shape의 메소드만 나온다.
	      //s.tview(); tview도 안나옴
	      
	      System.out.println("------------------------------");
	      Test t = new MultiClass();
	      t.tview(); // tview밖에 안나옴
	      
	      System.out.println("------------------------------");
	      
	      MultiClass mt = new MultiClass();
	      mt.show("king"); // 자기 자신을 객체로 하면 모두 다 쓸 수 있다
	}

}
