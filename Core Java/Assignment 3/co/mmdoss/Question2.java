package co.mmdoss;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Question2 {

	public static void main(String[] args) {
		
		HashSet<Person> hashSet=new HashSet<>();
		LinkedHashSet<Person> linkedHashSet=new LinkedHashSet<>();
		
		hashSet.add(new Person("Doss",160,98));
		hashSet.add(new Person("Adam",158,98));
		hashSet.add(new Person("Mark",158,98));
		hashSet.add(new Person("Bob",155,86));
		hashSet.add(new Person("Carl",160,86));
		
		System.out.println("-------Iterating HashSet-------");
		Iterator<Person> it1=hashSet.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		linkedHashSet.add(new Person("Doss",160,98));
		linkedHashSet.add(new Person("Adam",158,98));
		linkedHashSet.add(new Person("Mark",158,98));
		linkedHashSet.add(new Person("Bob",155,86));
		linkedHashSet.add(new Person("Carl",160,86));
		
		System.out.println("-------Iterating LinkedHashSet-------");
		Iterator<Person> it2=linkedHashSet.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
	}

}
