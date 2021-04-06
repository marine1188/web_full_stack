package quiz;

public class Bus implements Transport {

	private double speed = 0;
	
	@Override
	public void move()  {
		while( speed < 5 ) {
			speed +=  (accelerater * 5);
			System.out.println("Accelerating....." + speed);
			
			try {
				
				Thread.sleep(500);  //  1/1000  ====> 1√  
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}      
			
		} // while end
	}

	@Override
	public void stop() {
		speed = 0;
		System.out.println("Emergency Stop.......................");
	}

}



