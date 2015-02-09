/* 2. Counting
	The value of the counter at the end of execution is unpredictable:
	each of the 100 threads running will take 
	to make sure the last value is what it should be (i.e. 100,000),
	a lock could be added to the counter, so each of the 100 threads running 
	would increase the counter by 1000 (running the increase from 0 to 1000 
	without being interrupted), even if this solution nullifies the advantages
	of a multi-thread process, making it a single thread in effect?
*/

public class Increaser implements Runnable {
	private static Counter c;
	
	public Increaser(Counter counter) {
		this.c = counter;
	}
	
	public static void main(String[] args) {
		Counter counter = new Counter();
		for(int i=0; i<100; i++) {
			Increaser increaserTask = new Increaser(counter);
			Thread t = new Thread(increaserTask);
			t.start();
		}
		System.out.println(c.getCount());
	}
	
	public void run() {
		synchronized(c) {
			System.out.println("Starting at " + c.getCount());
			for(int i=0; i<1000; i++) {
				c.increase();
			}
			System.out.println("Stopping at " + c.getCount());
		}
	}
	
}	

