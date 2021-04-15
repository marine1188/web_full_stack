package ex02.gui;

import java.awt.*;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MainEntry {
	public static void main(String[] args) {
		Frame f = new Frame();
		
		f.setTitle("First Frame");
		f.setBackground(Color.yellow);
		//f.setSize(500,400); // f.pack();
		//f.setLocation(800,500);
		f.setBounds(500,350,500,300);
		f.setVisible(true);
		
		//익명(무명)클래스 - 닫기 이벤트 처리
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("닫아요");
			}
			
		});
	}
}
