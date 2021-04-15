package ex01_thread;

public class UserThread extends Thread {   //
		private String name;
		
		public UserThread(String name) {
			this.name = name;
		}
		
		public UserThread() {
			// TODO Auto-generated constructor stub
		}
	
		@Override
		public void run() {  // 스레드 실행부(구현부) - JVM
			System.out.println(name);
			//System.out.println("start() 메소드에 의해 run()이 유도된다(실행대기) ");
			
			for (int i = 1; i <= 10; i++) {
				
				if( i == 7 ) {
//					System.out.println(i + " " + name);
					try {
						sleep(500);  // 0.5초 동안,   1/1000 <=== 1초
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // for end
				
//				System.out.println(i);
				System.out.println(i + " : " +  name);
			}
		}
		
		
}





