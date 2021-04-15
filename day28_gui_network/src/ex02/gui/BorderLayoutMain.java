package ex02.gui;

import java.awt.*;
import javax.swing.JFrame;

public class BorderLayoutMain extends JFrame {
	
	public BorderLayoutMain() {
		Button btn1 = new Button("EAST");
		Button btn2 = new Button("West");
		Button btn3 = new Button("Center");
		Button btn4 = new Button("South");
		Button btn5 = new Button("North");
		
		Panel  p = new Panel();
		List list = new List(5, true);
		list.add("김연아");
		list.add("박태환");
		list.add("한지민");
		list.add("김영삼");
		list.add("이승만");
		
		p.add(list);
		add(p);
		
		add(btn1, BorderLayout.EAST);
		add(btn2, BorderLayout.WEST);
		add(p, BorderLayout.CENTER);
		
		add("South", btn4);
		add("North", btn5);
		
		setTitle("BoarderLayout Test");
		setBounds(350, 200, 400, 300);
		setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new BorderLayoutMain();
	}
}