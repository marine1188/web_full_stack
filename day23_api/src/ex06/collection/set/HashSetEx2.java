package ex06.collection.set;
import java.util.*;

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Person ) {
			Person temp = (Person)obj;
			
			return name.equals(temp.name) && age == temp.age;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
		
} // Person end

public class HashSetEx2 {
	public static void main(String[] args) {
		Set  set = new HashSet();
		
		set.add(new Person("doyeon", 33));
		set.add(new Person("David", 20));
		set.add(new Person("David", 20));
		set.add(new Person("David", 10));
		set.add(new String("happy"));
		set.add(new String("happy"));
		
		System.out.println(set);
	}
}










