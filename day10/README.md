## Day Ten

### Learning Goals

Before the next day, you should have achieved the following learning goals:
  * Understand the concept of inheritance
  * Extend classes
  * Override methods
  * Use `super` both for method calling and construction
  * Understand the use of `final` for classes and methods
  * Understand the meaning `private`, `public`, and `protected`
  
  **Note:** Many exercises below instruct you to create methods. Unless the exercise description says otherwise, a very
simple implementation (e.g. just printing something on screen) will be enough. The point today is on practicing 
inheritance, not over-complicated algorithms for smartphones, musical instruments, etc.
  
### 1. Extension, extension...

Create a class [OldPhone] [1] that implements the following interface.
```
/**
 * A phone makes calls
 */
 public interface Phone {
    /**
     * Just print on the screen: "Calling <number>...".
     */
    void call(String number);
 }
```
Now create a class [MobilePhone] [2] that extends [OldPhone] [1] and adds methods for things like `ringAlarm(String)` and
`playGame(String)`. This class keeps a list of the last ten numbers that have been called, which can be printed with
the method `printLastNumbers()`.
	Then create a class [Smartphone] [3] that extends [MobilePhone] [2] and adds methods for `browseWeb(String)` and
`findPosition()`, the latter returning a (fictitious) GPS-found position.
	Create a small script called `PhoneLauncher` in which you create a `SmarthPhone` and use all its methods, including
those inherited from its ancestor classes.
```
public class PhoneLauncher {
	public static vod main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	public void launch() {
		// your code creating and using SmartPhone here...
	}
}
```

(*created class [OldPhone] [1], [MobilePhone] [2], [SmartPhone] [3] and [phoneLauncher.groovy] [4]*)

### 2. Overriding

Save money by routing your international calls through the internet! Modify your class [SmartPhone] [3] so that it
overrides the method `call(String)` inherited from [OldPhone] [1]. If the string parameter starts with “00”, the method
should output “Calling <number> through the internet to save money”; otherwise, the method should do the same
as the original method (hint: use `super`).

(*modified class [Smartphone] [3]*)

### 3. Passing information to ancestor classes

Add the following field, constructor, and method to [OldPhone] [1]:

```
private String brand = null;
public OldPhone(String brand) {
this.brand = brand;
}
public String getBrand() {
return brand;
}
// ... there is no setter for brand
```

Add the appropriate constructors to [MobilePhone] [2] and [SmartPhone] [3] in order to be able to call the method
`getBrand()` from an object of class [SmartPhone] [3] and obtain the right answer, i.e. the brand provided in the 
constructor.

(*updated classes [MobilePhone] [2] and [Smartphone] [3]*)

### 4. Visibility

#### 4.1 Increasing visibility

Change the visibility of `playGame(String)` to `private` and check whether the script you wrote in the former exercise
still works. Why does this happen? What are the minimal changes that you need to make on class [SmartPhone] [3] so
that the script still works?

(*If the method in the superclass becomes private, its subclasses cannot have access to it: 
[Smartphone] [3] would have to implement its own method*)

#### 4.2 Reducing visibility

Some parents are concerned that their children spend too much time playing with their smartphones. Create a class
[RestrictedSmartPhone] [5] that overrides `playGame(String)` to make it private and thus non-visible to external
classes and scripts. Is this possible? Why?

(*It is not possible to override the access to private, as it outputs "attempting to assign weaker access privileges; was public"
 it seems therefore necessary to override the code itself and keep the access public.*)

### 5. Multiple inheritance

Create a class [MusicalInstrument] [6] with a method `play()`. Now create another class [WoodenObject] [7] with a method
`burn()`.
Create a class [Guitar] [8] that is at the same time a musical instrument and a wooden object. How would you do
it in Java?

(*created [MusicalInstrumentImpl] [9], [WoodenObjectImpl] [10] and [GuitarTest] [11]. The interfaces have* `default`
*methods so a Guitar class can call that default implementation without having to extend anything.*)

### 6. Java magic

Can you see what is wrong in the following code (most JavaDoc comments omitted for the sake of space)?

```
// Teacher.java
public class Teacher {
    private String name;
    public Teacher(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void teach(String lessonName) {
        System.out.println("Teaching lesson: " + lessonName);
    }
}

(...)

// Lecturer.java
// A lecturer has both teaching and research responsibilities

public class Lecturer extends Teacher {
    public void doResearch(String topic) {
        System.out.println("Doing research on: " + topic);
    }
}
```
If it is not evident, try to compile the code.
If it compiles without problems, write a script that creates an object of class Lecturer and uses its two methods.
If it does not, modify class Lecturer so that the program compiles, and then write the script to use its two methods.

(*It is necessary to pass to the constructor a String argument as in [Teacher] [12] class*)

### 7. Final means no change

Create a class that extends `String` and adds a method `printEven()` that prints on screen the even-numbered
characters of the string. Try to compile it and see what happens.

(*Compilation error: cannot inherit from final java.lang.String  
It is not possible to extends final classes, as they are immutable*)

### 8. Noah's Ark (*)

(*created a superclass (abstract) [Animal] [13] and two abstract subclasses below, [EggLaying] [14]
and [Mammal] [15] to implement their own reproduction method. Below that, other abstract classes for types
 to group common behaviours, and at the bottom the more specific races, which might override makeSound(); 
 all in package [noahsArk] [16]*)

[1]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day10/src/phone/OldPhone.java
[2]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day10/src/phone/MobilePhone.java
[3]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day10/src/phone/SmartPhone.java
[4]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day10/src/phone/phoneLauncher.groovy
[5]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day10/src/phone/RestrictedSmartPhone.java
[6]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day10/src/multipleInheritance/MusicalInstrument.java
[7]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day10/src/multipleInheritance/WoodenObject.java
[8]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day10/src/multipleInheritance/Guitar.java
[9]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day10/src/multipleInheritance/MusicalInstrumentImpl.java
[10]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day10/src/multipleInheritance/WoodenObjectImpl.java
[11]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day10/src/multipleInheritance/GuitarTest.java
[12]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day10/src/javaMagic/Teacher.java
[13]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day10/src/noahsArk/Animal.java
[14]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day10/src/noahsArk/EggLaying.java
[15]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day10/src/noahsArk/Mammal.java
[16]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/tree/master/day10/src/noahsArk
