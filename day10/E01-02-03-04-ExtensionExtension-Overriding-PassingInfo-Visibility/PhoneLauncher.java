// 1. Extension, extension...

public class PhoneLauncher {
	
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	
	public void launch() {
		RestrictedSmartPhone p = new RestrictedSmartPhone("iPhony");
		System.out.println("===========");
		System.out.println(p.getBrand());
		System.out.println("===========");
		p.call("Eraserhead");
		p.call("Bob");
		p.call("Robert");
		p.call("Jimmy");
		p.call("Rod");
		p.ringAlarm("Wake Up!");
		p.playGame("Snake");
		p.printLastNumbers();
		p.browseWeb("www.songkick.co.uk");
		p.findPosition();
		p.call("Jason");
		p.call("Mum");
		p.call("999");
		p.call("0039646342384");
		p.call("Jeremiah");
		p.call("Jeremiah NEW");
		p.printLastNumbers();
	}
	
}