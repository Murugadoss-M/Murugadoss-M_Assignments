package co.mmdoss;

@FunctionalInterface
interface Arithmetic{
	public void template(double d1 ,double d2);
}

public class Assignment_4_1 {
	public static void main(String[] args) {
		double a=10,b=5;
		System.out.print("Addition : ");
		print(a,b,(d1,d2)->System.out.println(d1+d2));
		
		System.out.print("Subtraction : ");
		print(a,b,(d1,d2)->System.out.println(d1-d2));
		
		System.out.print("Multiplication : ");
		print(a,b,(d1,d2)->System.out.println(d1*d2));
		
		System.out.print("Division : ");
		print(a,b,(d1,d2)->System.out.println(d1/d2));
	}
	private static void print(double a,double b,Arithmetic arithmetic) {
		arithmetic.template(a, b);
	}
}
