package phone;// 1. Extension, extension...

public class MobilePhone extends OldPhone {
	private String[] callsLog;
	
	public MobilePhone(String brand) {
		super(brand);	// 3. Passing information to ancestor classes
		callsLog = new String[10];
	}
	
	@Override
	public void call(String number) {
		super.call(number);
		saveCall(number);
	}
	
	public void saveCall(String number) {
		while(true) {
			for(int i=0; i<callsLog.length; i++) {
				if(callsLog[i]==null) {
					callsLog[i] = number;
					return;
				}
			}
			for(int i=0; i<callsLog.length-1; i++) {
				callsLog[i] = callsLog[i+1];
			}
			callsLog[callsLog.length-1] = null;
			continue;
		}
	}
	
	public void printLastNumbers() {
		System.out.println("CALLS LOG:");
		if(callsLog[0]==null) {
			System.out.println("<empty>");
			return;
		} else {
			int n=1;
			for(int i=callsLog.length-1; i>=0; i--) {
				if(callsLog[i]==null) {
					continue;
				} else {
					System.out.println(n + ". " + callsLog[i]);
					n++;
				}
			}
		}
	}
	
	public void ringAlarm(String message) {
		System.out.println("ALARM: " + message);
	}
	
	private void playGame(String gameName) {	// 4.1 Increasing visibility
		System.out.println("Opening " + gameName + "...");
	}

}