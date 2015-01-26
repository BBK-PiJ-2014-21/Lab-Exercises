import java.util.List;
import java.util.ArrayList;
	
public class Exception {

	public void launch(int newElement) {
		List<Integer> list = new ArrayList<Integer>();
		try {
			list.add(newElement);
			list.get(0);
		} catch (Exception ex) {
			ex.printStackTrace();
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Exception e = new Exception();
		e.launch(2);
	}
	
}