/*
package ex01.inner;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class InnerMain {
	

	class EventHandler implements ActionListener{// inner class

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("actionEvent 발생");
			
		}// inner class
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame("이벤트 처리 - 이너클래스");
		Button btn = new Button("Button-Start");
		
		EventHandler hander = new InnerMain().new EventHandler();
		// button event 
		btn.addActionListener(hander);
		
		frame.add(btn);
		frame.setVisible(true);
		frame.setSize(300,200);
		frame.setLocation(700,350);
	}

}

*/
// 보안
package ex01.inner;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class InnerMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame("이벤트 처리 - 이너클래스");
		Button btn = new Button("Button-Start");
		// button event 
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent 발생");
				// 발생한 이벤트의 이름이 나옴
				System.out.println(e.getActionCommand());
				System.out.println(e.getSource());
				
			}
		});
		
		frame.add(btn);
		frame.setVisible(true);
		frame.setSize(300,200);
		frame.setLocation(700,350);
	}

}


