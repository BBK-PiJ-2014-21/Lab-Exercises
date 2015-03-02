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

Create a class `OldPhone` that implements the following interface.
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
Now create a class `MobilePhone` that extends `OldPhone` and adds methods for things like `ringAlarm(String)` and 
`playGame(String)`. This class keeps a list of the last ten numbers that have been called, which can be printed with
the method `printLastNumbers()`.
	Then create a class `Smartphone` that extends `MobilePhone` and adds methods for `browseWeb(String)` and
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

(*created class [OldPhone] [1], [MobilePhone] [2], [SmartPhone] [3] and [PhoneLauncher] [4]*)

### 2. Overriding

(**)

### 3. Passing information to ancestor classes

(**)

### 4. Visibility

#### 4.1 Increasing visibility

(**)

#### 4.2 Reducing visibility

(**)

### 5. Multiple inheritance

(**)

### 6. Java magic

(**)

### 7. Final means no change

(**)

### 8. Noah's Ark (*)

(**)

[1]:
