package learning;

import java.util.Scanner;

public class sum {
public static void main(String[] args) {
	String s;
	int sum=0;
	System.out.println("Enter any no. of Integers to be added : ");
	Scanner sc=new Scanner(System.in);
	s=sc.nextLine();
	String[] sarr;
	sarr=s.split(" ");
	int num;
	for(int i=0;i<sarr.length;i++) {
	
		try {
		num=Integer.parseInt(sarr[i]);
		}
		catch(Exception e) {
			System.out.println("Some Non-Integer values entered");
			return;
		}
		sum=sum+num;
				
		
	}
	System.out.println(sum);
}
}
