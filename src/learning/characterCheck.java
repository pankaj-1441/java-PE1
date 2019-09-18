package learning;

import java.util.Scanner;

public class characterCheck {
public static void main(String[] args) {
	String s;
	System.out.println("Enter any character : ");
	Scanner sc=new Scanner(System.in);
	s=sc.nextLine();
	char a=s.charAt(0);
	if(a>64&&a<91) {
		System.out.println("Capital letter");
	}
	else if(a>96&&a<123) {
		System.out.println("Small letter");
	}
	else if(a>47&&a<58) {
		System.out.println("Integer");
	}
	else {
		System.out.println("Special character");
	}
}
}
