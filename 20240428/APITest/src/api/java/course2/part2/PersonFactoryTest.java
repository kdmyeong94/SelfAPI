package api.java.course2.part2;

import api.java.model2.Person;
import api.java.model2.PersonFactory;

public class PersonFactoryTest {
	public static void main(String[] args) {
//		PersonFactory personFactory = Person::new;
//		Person person = personFactory.create("홍길동", 40);
//		System.out.println(person);
		
		
		// 익명내부클래스
		PersonFactory personFactory = new PersonFactory() {
			
			@Override
			public Person create(String name, int age) {
				// TODO Auto-generated method stub
				return new Person(name, age);
			}
		};
		
		Person person = personFactory.create("나길동", 32);
		System.out.println(person);
	}
}
