package menu;
import java.io.IOException;
import java.util.*;

import chapter.one.*;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cnsl = new Scanner(System.in);
        
        System.out.println("1-Chapter one");
        System.out.println("2-Chapter two");
        System.out.println("3-Chapter three");
        String input = cnsl.nextLine();
        
        if(Integer.parseInt(input) == 1){
        	Menu.chapterOne();
        }
        else if(Integer.parseInt(input) == 2){
           Menu.chapterTwo();
        }
	}
	
	public static void chapterOne() {
		Scanner cnsl = new Scanner(System.in);
        
        System.out.println("1-Fizz Buzz with three");
        System.out.println("2-Fizz Buzz with three and five");
        System.out.println("3-Fizz Buzz complete");
        System.out.println("4-Fizz Buzz faster");
        String input = cnsl.nextLine();
        
        FizzBuzz.fizzBuzzSelection(Integer.parseInt(input));
    }

	public static void chapterTwo() {
		Scanner cnsl = new Scanner(System.in);
        
        System.out.println("1-");
        System.out.println("2-");
        System.out.println("3-");
        System.out.println("4-");
        String input = cnsl.nextLine();
    }
	
}
