package co.mmdoss;
import java.util.Random;

abstract class Persistence {

	public Persistence() {
		// TODO Auto-generated constructor stub
	}
	abstract void persist();

}
class FilePersistence extends Persistence{

	@Override
	void persist() {
		System.out.println("Data saved in File");
	}
	
}
class DatabasePersistence extends Persistence{

	@Override
	void persist() {
		System.out.println("Data saved in database");
	}
	
}
public class Main{
	public static void main(String args[]) {
		Persistence p;
		int random=0;
		Random obj=new Random();
		do {
			random=obj.nextInt(3);
		}while(random<=0);
		if(random==1) {
			p=new FilePersistence();
			p.persist();
		}
		else if(random==2) {
			p=new DatabasePersistence();
			p.persist();
		}
		else {
			System.out.println("Random error");
		}
		
	}
}
