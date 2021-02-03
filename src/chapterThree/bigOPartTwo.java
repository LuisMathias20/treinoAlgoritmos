package chapterThree;

import chapterTwo.bigOPartOne;

public class bigOPartTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = 1;
		
		bigOPartTwo.selection(option);
	}

	public static void selection(int option) {
		int[] n = {-5,-2,0,1,4,8};
		
		if(option == 1) {
			bigOPartTwo.simpleLoop(n);
		} 
		else if(option == 2) {
			bigOPartTwo.containsDuplicatesSlower(n);
		}
		else if(option == 3) {
			bigOPartTwo.containsDuplicatesFaster(n);
		}
		else if(option == 4) {
			bigOPartTwo.search(n);
		}
		else if(option == 5) {
			bigOPartTwo.dichotomy(n);
		}
	}
	
	public static void simpleLoop(int[] n) {
		int max = 0;
		
		for(int i = 0; i < n.length; i++) {
			if (max < n[i]) {
				max = n[i];
			}
		}
		System.out.println(max);
	}
	
	public static void containsDuplicatesSlower(int[] n) {
		boolean exist = false;
		
		for(int i = 0; i < n.length; i++) {
			for(int j = 0; j < n.length; j++) {
				if( i != j && n[i] == n[j]) {
					exist = true;
				}
			}
		}
		System.out.print(exist);
	}
	
	public static void containsDuplicatesFaster(int[] n) {
		boolean exist = false;
		
		for(int i = 0; i < n.length; i++) {
			for(int j = 1 + i; j < n.length; j++) {
				if( i != j && n[i] == n[j]) {
					exist = true;
				}
			}
		}
		
		System.out.print(exist);
	}
	
	public static void search(int[] n) {
		int low = 0;
		int high = n.length-1;
		int mid = 0;
		int item = 0;
		
		while(low <= high) {
			mid = low+(high-low)/2;
			if(n[mid] == item) {
				System.out.print(mid);
			}
			else if(n[mid]<item) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
			System.out.print("Unsuccessful result");
		}
	}
	
	public static void dichotomy(int[] n) {
		int a = 0;
		int b = n.length - 1;
		
		while (a <= b) {
			int h = (a+b)/2;
			if(n[h] == 0) {
				System.out.println(h);
			}
			else if(n[h] > 0) {
				b = h;
			}
			else if(n[h] < 0) {
				a = h;
			}
		}
	}
}
