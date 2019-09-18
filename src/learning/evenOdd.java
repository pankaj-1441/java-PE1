package learning;

import java.util.Scanner;

public class evenOdd {
public static void main(String[] args) {
	int num=0;
	System.out.println("Enter any number between 1-100 : ");
	Scanner sc= new Scanner(System.in);
	num=sc.nextInt();
	if(num%2!=0 && num>20 && num<30) {
		System.out.println("Tom");
	}
	if(num%2==0 && num>20 && num<30) {
		System.out.println("Jerry");
	}
}
}