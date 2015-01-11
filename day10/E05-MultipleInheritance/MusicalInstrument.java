// 5. Multiple inheritance

public interface MusicalInstrument {
	
	default void play() {
		System.out.println("<play>");
	}

}