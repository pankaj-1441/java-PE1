package learning;

import java.util.Scanner;

public class mainDrivingFunction {

public static void main(String[] args) {
	System.out.println("1. Check wheather a number is palindrome and sum of its even digits is greater than 25 or not");
	System.out.println("2. Check wheather a number exists between 20-30 and weather it is even or odd");
	System.out.println("3. Check wheather the letters of a word are vowel or consonant");
	System.out.println("4. Print the following output: 122333444455555666666......nth iteration");
	System.out.println("5. Print the sum of n number of integers");
	System.out.println("6. Check weather character entered is a capital letter, a small case letter, a digit or a special symbol");
	System.out.println("7. Arrange the digits of a number in non-decreading order and determine the sum of its even digits");
	System.out.println("8. Guess a number");
	System.out.println("9. Print the reverse of a string");
	System.out.println("10. Repeat the last n letters of a string");
	System.out.println("Choose from above functions : ");

	
	Scanner sc=new Scanner(System.in);
	int choose=sc.nextInt();
	switch(choose) {
	case 1 : Palindrome.main(null);break;
	case 2 : evenOdd.main(null);break;
	case 3 : vowelConsonant.main(null);break;
	case 4 : nIterations.main(null);break;
	case 5 : sum.main(null);break;
	case 6 : characterCheck.main(null);break;
	case 7 : NumberSort.main(null);break;
	case 8 : GuessNumber.main(null);break;
	case 9 : stringReverse.main(null);break;
	case 10 : nLettersRepeat.main(null);break;
	default:System.out.println("Choose function from above list 1-10");break;
	
	}








}
}
