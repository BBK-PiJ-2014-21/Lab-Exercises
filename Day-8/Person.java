// 1. Supermarket queue - class Person version 1

public class Person {
	String name;
	int age;
	Person next;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.next = null;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public Person getNext() {
		return next;
	}
	
	public void setNext(Person person) {
		this.next = person;
	}
	
	public Person getPerson() {
		return this;
	}
	
}
