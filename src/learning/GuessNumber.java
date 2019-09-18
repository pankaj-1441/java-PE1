package learning;

import java.util.Scanner;

public class GuessNumber {
public static void main(String[] args) {
	System.out.println("Guess Number between 1-50 : ");
	Scanner sc=new Scanner(System.in);
	int a;
	while((a=sc.nextInt())!=37) {
		if(a<37) {System.out.println("Number guessed is less than original number");}
		if(a>37) {System.out.println("Number guessed is greater than original number");}
		
	}
	if(a==37) {System.out.println("Number guessed is matches the original number");}
}
}
