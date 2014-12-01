// 07. Queues (*) - Test

public class IntQueueTest {
	
	public static void main(String[] args) {
		IntQueueImpl q = new IntQueueImpl();
		q.printSize();
		q.insert(5);
		q.insert(8);
		q.insert(12);
		q.printSize();
		q.retrieve(5);
		q.insert(13);
		q.printSize();
		q.retrieve(8);
		q.retrieve(12);
		q.printSize();
		q.retrieve(13);
		q.printSize();
		q.retrieve(133);
		q.printSize();
	}
	
}