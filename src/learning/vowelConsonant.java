package learning;

import java.util.Scanner;

public class vowelConsonant {
public static void main(String[] args) {
	String str;
	System.out.println("Enter any word : ");
	Scanner sc= new Scanner(System.in);
	str=sc.nextLine();
	
	for(int i=0;i<str.length();i++) {
		char a=str.charAt(i);
		if((a>64&&a<91)||(a>96&&a<123)) {
		if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U'||a=='a'||a=='e'||a=='i'||a=='0'||a=='u') {
			System.out.println(a+"-vowel");
		}
		else {
			System.out.println(a+"-consonant");
		}
		}
		else {
			System.out.println(a+"-wrong Input");
		}
	}
}
}
