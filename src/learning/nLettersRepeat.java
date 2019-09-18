package learning;

import java.util.Scanner;

public class nLettersRepeat {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any string : ");
	String s=sc.next();
	System.out.println("Enter an integer n to repeat n number of letters from end : ");
	int n=sc.nextInt();
	System.out.print(s);
	char[] c=s.toCharArray();
	for(int i=0;i<n;i++) {
		for(int j=s.length()-n;j<s.length();j++) {
			System.out.print(c[j]);
		}
	}
}
}
