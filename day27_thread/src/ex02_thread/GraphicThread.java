/*
package ex02_thread;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.*;

import javax.swing.JFrame;

public class GraphicThread extends JFrame implements Runnable {
	//Frame : woindow
	
	int num,x,y;
	Color color;
	Random random;
	
	public  GraphicThread(int num) {//생성자 생성 
		this.num = num;
		color = Color.red;
		random = new Random();
		
		setSize(500,400);//프레임(화면) 크기 - 너비,높이
		setLocation(300.150);
		
		
		setVisible(true);// 화면 보여주기
		//화면 뜨는 위치 변경
		// 위치 지정
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 닫기 기능
	}
	




	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("call~~");
		Rectangle rect = getBounds(); //모서리 둥근
		
		for (int i = 0; i < num; i++) {
			x = random.nextInt(rect.width);
			y = random.nextInt(rect.height);
			
			repaint();
			
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void paint(Graphics g) {
		g.setColor(color);
		g.fillRect(x,y,3,3);
	}
	
	public static void main(String[] args) {
//		// 화면 출력 1
//		GraphicThread gframe = new GraphicThread(2000);
//		Thread t1 = new Thread(gframe);
//		t1.start();
		
		// 2. 위에 코드 줄이면
		new Thread(new GraphicThread(3000)).start();
	}

}
*/

package ex02_thread;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;
import javax.swing.JFrame;

public class GraphicThread 
							extends JFrame implements Runnable {
									// Frame  : window	
	//
	int num, x, y;
	Color color;
	Random random;
	
	public GraphicThread(int num) {  // 생성자함수 - 초기화
		this.num = num;
		color = Color.red;
		random = new Random();
		
		setSize(500, 400);  // 프레임(화면) 크기 - 너비, 높이
		setVisible(true); // 화면보여주기
		setLocation(700, 350);  // 위치 지정
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기		
	}
	
	
	@Override
	public void run() {
		Rectangle rect = getBounds();
		
		for (int i = 0; i < num; i++) {
			x = random.nextInt(rect.width);
			y = random.nextInt(rect.height);
			repaint();
			// 0.1 초 안에 1개씩 계속 찍힘
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, 3, 3);
	}


	public static void main(String[] args) {
		//1.
//		GraphicThread gframe = new GraphicThread(2000);
//		Thread t1 = new Thread(gframe);
//		t1.start();
		
		//2. 
		new Thread(new GraphicThread(3000)).start();
	}
}

