package learning;
import java.util.Arrays;
import java.util.Collections;

import java.util.Scanner;

public class NumberSort {
public static void main(String[] args) {
	int num;
	System.out.println("Enter any integer to sort its digits in non.decreasing order and check if sum of its even digitd is greater than 15 : ");
    Scanner sc = new Scanner(System.in);
	num=sc.nextInt();
	int count=0;
	int r=num;	
	while(r>0) {
		count++;
		r=r/10;
	}
	
	int[] arr=new int[count];
	for(int i=0;i<count;i++) {
		arr[i]=num%10;
		num=num/10;
	}
	Arrays.sort(arr); 
	
	
	int b=0;
	int sum=0;
	for(int k=0;k<count;k++) {
		if(arr[k]%2==0) {
		sum=sum+arr[k];
		}
	}
	
	for(int i=count-1;i>=0;i--) {
		
		b=b*10+arr[i];
	}
	System.out.println("Sorted number in Non-Increasing order : "+b);
	System.out.println("Sum of even numbers : "+sum);
	if(sum>15) {
		System.out.println("True");
	}
	else {
		System.out.println("False");
	} 
	
}


}


