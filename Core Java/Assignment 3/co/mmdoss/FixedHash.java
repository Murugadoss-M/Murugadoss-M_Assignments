package co.mmdoss;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

class Employe{
	String name;
	public Employe(String name) {
		this.name=name;
	}

	@Override
	public int hashCode() {
		return 10;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	
}

public class FixedHash {
	public static void main(String[] args) {
		Hashtable<Employe, Integer> hashtable =new Hashtable<>();
		hashtable.put(new Employe("Doss"), 1);
		hashtable.put(new Employe("Alex"), 2);
		hashtable.put(new Employe("Bob"), 3);
		
		Set<Entry<Employe, Integer>> entrySet = hashtable.entrySet();
		for (Entry<Employe, Integer> entry : entrySet) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
