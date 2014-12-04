// 1. Extension, extension...

public class MobilePhone extends OldPhone {
	private String[] callsLog;
	
	public MobilePhone(String brand) {
		super(brand);	// 3. Passing information to ancestor classes
		callsLog = new String[10];
	}
	
	public void printLastNumbers() {
		System.out.println("CALLS LOG:");
		for(int i=0; i<callsLog.length-2; i++) {
			if(callsLog[i]==null) {
				return;
			} else {
				System.out.println(i+1 + ": " + callsLog[i]);
			}
		}
	}
	
	public void ringAlarm(String message) {
		System.out.println("ALARM: " + message);
	}
	
	public void playGame(String gameName) {
		System.out.println("Opening " + gameName + "...");
	}

}