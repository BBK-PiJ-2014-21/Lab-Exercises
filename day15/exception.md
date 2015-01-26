
### 2. Exception

	// Some code here
	try {
		// more code here
		list.add(newElement);
		// more code here
	} catch (Exception ex) {
		ex.printStackTrace();
	} catch (NullPointerException ex) {
		ex.printStackTrace();
	}
	
error: incompatible types: Exception cannot be converted to Throwable
	
	} catch (Exception ex) {

error: cannot find symbol

	ex.printStackTrace();

symbol:	method printStackTrace()
location: variable ex of type Exception