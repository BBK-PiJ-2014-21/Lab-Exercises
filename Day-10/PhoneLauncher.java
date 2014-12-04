// 1. Extension, extension...

public class PhoneLauncher {
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	
	public void launch() {
		SmartPhone p = new SmartPhone("iPhony");
		System.out.println("Brand: " + p.getBrand());
		p.call("Jeremiah");
		p.call("Bob");
		p.call("0039057266315");
		p.call("999");
		System.out.println();
		p.printLastNumbers();
		p.ringAlarm("wake up");
		p.playGame("Snake");
		p.browseWeb("www.songkick.co.uk");
		p.findPosition();
	}
}