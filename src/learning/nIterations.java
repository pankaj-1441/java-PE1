package learning;

import java.util.Scanner;

public class nIterations {
   public static void main(String[] args) {
	int num=0;
	System.out.println("Enter any Integer : ");
	Scanner sc=new Scanner(System.in);
	num= sc.nextInt();
	for(int i=1;i<=num;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(i);
		}
	}
}
}
