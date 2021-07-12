package co.mmdoss;

public class TaxCalculator {

	public TaxCalculator() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]) {
		double ctc;
		double tax=0;
		ctc=KeyboardUtil.getDouble("Enter your CTC : ");
		if(ctc<=0) {
			System.out.println("Invalid amount");
			System.exit(0);
		}
		else if(ctc<=180000) {
			tax=0;
		}
		else if(ctc<=300000) {
			tax=ctc*0.1;
		}
		else if(ctc<=500000) {
			tax=ctc*0.2;
		}
		else {
			tax=ctc*0.3;
		}
		System.out.println("Tax to be paid is : "+tax);
	}

}
