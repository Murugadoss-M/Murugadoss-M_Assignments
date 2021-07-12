package co.mmdoss;
import java.lang.Math;
class ArmstrongNumber {

	private ArmstrongNumber() {
		// TODO Auto-generated constructor stub
	}
	public static void checkArmstrong(int num[]) {
		int temp,cube;
		for(int i : num) {
			temp=i;
			cube=0;
			while(temp>0) {
				cube+=Math.pow((temp%10), 3);
				temp/=10;
			}
			if(i==cube) {
				System.out.println(i + " is an Armstrong number");
			}
		}
	}

}
