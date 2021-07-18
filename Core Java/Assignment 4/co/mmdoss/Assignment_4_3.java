package co.mmdoss;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Assignment_4_3 {
	public static void main(String[] args) {
		System.out.print("Lambda using Consumer interface : ");
		Supplier<Integer> supply=()->5;
		Function<Integer,Integer> func=a->a*a;
		Predicate<Integer> predict=a->{
			if (a%5==0)
				return true;
			else
				return false;
		};
		Consumer<Boolean> consume=a->{
			if(a)
				System.out.println("Divisible by 5");
			else
				System.out.println("Not divisible by 5");
		};
		usingFI(consume,predict,func,supply);
	}
	private static void usingFI(Consumer<Boolean> consume,Predicate<Integer> predict,Function<Integer, Integer> func,Supplier<Integer> supply) {
		consume.accept(predict.test(func.apply(supply.get())));
	}
}
