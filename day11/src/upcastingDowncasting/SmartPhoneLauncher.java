package upcastingDowncasting;

import phone.*;

/**
 *
 */
public class SmartPhoneLauncher {
    
    public static void main(String[] args) {
    //  MobilePhone myPhone = new SmartPhone("OnePlusOne");
        /*
          2.2 DIRECT UPCASTING 
          A variable of superclass MobilePhone doesn't
          have access to methods specific of the subclass SmartPhone
          (browseWeb and findPosition, and also playGame which is private
          in MobilePhone but public in SmartPhone); one solution would be to
          declare the variable as SmartPhone (as with the commented line
          above), or to typecast the MobilePhone variable.
        */
        MobilePhone myPhone = new SmartPhone("OnePlusOne");
        ((SmartPhone)myPhone).browseWeb("github.com");
        ((SmartPhone)myPhone).findPosition();
        ((SmartPhone)myPhone).playGame("Crossy Road");
        myPhone.call("02089665236");
        myPhone.getBrand();
        myPhone.printLastNumbers();
        myPhone.ringAlarm("WAKE UP");
        testPhone(myPhone);
        /*
          2.5 CASTING EXCEPTION
          MobilePhone mob = new MobilePhone("Mobster");
          testPhone(mob);
          results in: 
          Exception in thread "main" java.lang.ClassCastException:
          phone.MobilePhone cannot be cast to phone.SmartPhone 
        */
    }
    /*
      2.3 INDIRECT UPCASTING WHEN CALLING A METHOD
      This method takes as parameter an object of type Phone, so any subclass 
      will indirectly be upcasted, and inside the method only methods
      from superclass Phone can be directly called.
    */
    public static void testPhone(Phone phone) {
        phone.call("02097448675");
        /*
          2.4 DOWNCASTING
          Typecasting the object down to SmartPhone let it use its methods. 
        */
        ((SmartPhone)phone).findPosition();
    }

}
