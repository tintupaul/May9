package oopsConcepts;

public class MethodOverloading {

	public void add(int a, int b) {
		
		int sum = a+b;
		
		System.out.println("Int output " + sum);
	}
	
	public void add(double a, double b) {
		
		double sum = a+b;
		
		System.out.println("Double Output" + sum);
	}
	
	

}