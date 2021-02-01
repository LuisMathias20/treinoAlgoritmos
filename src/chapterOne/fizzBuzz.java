package chapterOne;

public class fizzBuzz {
	public static void main(String[] args) {
		int option = 1; //Select the function
		
		fizzBuzz.fizzBuzzSelection(option);
	}
	
	//Function selector
	public static void fizzBuzzSelection(int option) {
		int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		if(option == 1){
            fizzBuzz.fizzBuzzWithThree(numbers);
        }
        else if(option == 2){
            fizzBuzz.fizzBuzzWithThreeAndFive(numbers);
        }
        else if(option == 3){
            fizzBuzz.fizzBuzzComplete(numbers);
        }
        else if(option == 4){
            fizzBuzz.fizzBuzzFaster(numbers);
        }
        else {
            System.out.print("Invalid option");
        }
	}
	
	//1
	public static void fizzBuzzWithThree(int[] numbers) {
		for(int i=0;i<numbers.length;i++){
            if (numbers[i] % 3 == 0) {
                System.out.println(numbers[i]+" fizz");
            }
            else {
                System.out.println(numbers[i]);
            }
        }
	}
	
	//2
	public static void fizzBuzzWithThreeAndFive(int[] numbers) {
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%3==0){
                System.out.println(numbers[i]+" fizz");
            }
            else if(numbers[i]%5==0) {
                System.out.println(numbers[i]+" buzz");
            }
            else {
                System.out.println(numbers[i]);
            }
        }
    }
    
	//3
    public static void fizzBuzzComplete(int[] numbers){
        for(int i=0;i<numbers.length;i++){
            if((numbers[i]%3==0) && (numbers[i]%5==0)){
                System.out.println(numbers[i]+" fizzbuzz");
            }
            else if(numbers[i]%3==0){
                System.out.println(numbers[i]+" fizz");
            }
            else if(numbers[i]%5==0) {
                System.out.println(numbers[i]+" buzz");
            }
            else {
                System.out.println(numbers[i]);
            }
        }
    }
    
    //4
    public static void fizzBuzzFaster(int[] numbers){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%15==0){
                System.out.println(numbers[i]+" fizzbuzz");
            }
            else if(numbers[i]%3==0){
                System.out.println(numbers[i]+" fizz");
            }
            else if(numbers[i]%5==0) {
                System.out.println(numbers[i]+" buzz");
            }
            else {
                System.out.println(numbers[i]);
            }
        }
    }
}
