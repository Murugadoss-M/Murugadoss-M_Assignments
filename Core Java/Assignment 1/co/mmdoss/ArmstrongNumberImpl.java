package co.mmdoss;

public class ArmstrongNumberImpl {

	public ArmstrongNumberImpl() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]) {
		int num[]=new int[900];
		for(int i=0,j=100;j<=999;i++,j++) {
			num[i]=j;
		}
		ArmstrongNumber.checkArmstrong(num);
		
	}
	

}
