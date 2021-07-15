package co.mmdoss;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Person{
	String name;
	int weight;
	int height;
	
	public Person(String name, int height, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + height;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (height != other.height)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

	public String toString() {
		return "Person [Name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	
}
class Sorted implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		int c;
		c=o1.getWeight()-o2.getWeight();
		if(c==0)
			c=o1.getHeight()-o2.getHeight();
		if(c==0)
			c=o1.getName().compareTo(o2.getName());
		return c;
	}
	
}
public class Treeset {

	public static void main(String agrs[]) {
		TreeSet<Person> list=new TreeSet<>(new Sorted());
		list.add(new Person("Doss",160,98));
		list.add(new Person("Adam",158,98));
		list.add(new Person("Mark",158,98));
		list.add(new Person("Bob",155,86));
		list.add(new Person("Carl",160,86));
		Iterator<Person> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
