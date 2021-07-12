package co.mmdoss;

import java.lang.Math;

public class InerestCalculator {

	public InerestCalculator() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		double p,r,t;
		p=KeyboardUtil.getDouble("Enter Principal amount : ");
		r=KeyboardUtil.getDouble("Enter rate of interest (in percentage) : ");
		t=KeyboardUtil.getDouble("Enter time (in years) : ");
		r/=100;
		double simpleInterest,compoundInterest;
		simpleInterest=p*r*t;
		compoundInterest=p*Math.pow((1+r),2)-p;
		System.out.println("Simple Interest is = " + simpleInterest);
		System.out.println("Compound Interest is = " + compoundInterest);
	}

}
