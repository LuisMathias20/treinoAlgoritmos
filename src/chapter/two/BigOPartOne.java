package chapter.two;

public class BigOPartOne {

	public static void main(String[] args) {
		int option = 6;
		
		BigOPartOne.bigOPartOneSelection(option);
	}

	public static void bigOPartOneSelection(int option) {
		int n = 8;
		
		if(option == 1) {
			BigOPartOne.constant(n);
		} 
		else if(option == 2) {
			BigOPartOne.logN(n);
		}
		else if(option == 3) {
			BigOPartOne.nLogNTime(n);
		}
		else if(option == 4) {
			BigOPartOne.polynominalTime(n);
		}
		else if(option == 5) {
			BigOPartOne.exponentialTime(n);
		}
		else if(option == 6) {
			BigOPartOne.factorialTime(n);
		}
	}
	
	public static void constant(int n) {
		System.out.println("Hey - your input is: "+n);
	}
	
	public static void logN(int n) {
		for(int i=1; i<n; i=i*2) {
			System.out.println("Hey - I'm busy looking at: "+i);
		}
	}
	
	public static void nLogNTime(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1;j<n;j=j*2) {
				System.out.println("Hey - I'm busy looking at: "+i+" and "+j);
			}
		}
	}
	
	public static void polynominalTime(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n;j++) {
				System.out.println("Hey - I'm busy looking at: "+i+" and "+j);
			}
		}
	}

	public static void exponentialTime(int n) {
		for(int i=1; i<=Math.pow(2, n); i++) {
			System.out.println("Hey - I'm busy looking at: "+i);
		}
	}

	public static void factorialTime(int n) {
		long result = 1;
		
		for(int factor=1; factor<=n; factor++) {
			result *= factor;
			System.out.println("Hey I'm busy looking at: "+result);
		}
	}
}
