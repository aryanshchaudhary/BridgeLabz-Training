package level_1;
public class Person {
	String name;
	int age;
	String city;
	Person(String name, int age, String city){
		this.name = name;
		this.age = age;
		this.city = city;
	}
	Person(Person p){
		this.name = p.name;
		this.age = p.age;
		this.city = p.city;
	}
	void display() {
		System.out.println("Person name is " + name + " and his age is " + age + " and the city is " + city + ".");
	}
	public static void main(String[] args) {
		Person p1 = new Person("Aryansh", 23, "Mathura");
		Person p2 = new Person(p1);
		
		p1.display();
		p2.display();
	}
}
