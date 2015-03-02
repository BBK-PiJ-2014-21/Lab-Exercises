package counting;

public class Counter {
	private int n = 0;
	public synchronized void increase() {
		n++;
	}
	public synchronized int getCount() {
		return n;
	}
}