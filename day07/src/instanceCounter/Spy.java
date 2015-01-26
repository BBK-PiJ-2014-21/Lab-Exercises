package instanceCounter;// 1. Instance counter

public class Spy {
	private static int spyCount;
	private int id;

	public Spy(int id) {
		spyCount++;
		this.id = id;
		System.out.println("ID: " + id);
		System.out.println("Total number of spies: " + spyCount);
	}
	
	public void die() {
		System.out.println("instanceCounter.Spy " + id + " has been detected and eliminated");
		spyCount--;
		System.out.println("Total number of spies: " + spyCount);
	}
	
	public static void main(String[] args) {
		Spy spy1 = new Spy(001);
		Spy spy2 = new Spy(002);
		Spy spy3 = new Spy(003);
		Spy spy4 = new Spy(004);
		Spy spy5 = new Spy(005);
		Spy spy6 = new Spy(006);
		Spy spy7 = new Spy(007);
		spy7.die();
	}

}
		
		