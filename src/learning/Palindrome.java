package learning;
import java.util.Scanner;

public class Palindrome {
   public static void main(String[] args) {
	   int num;
	   int a;
	   System.out.println("Enter any Number :");
	   Scanner sc =new Scanner(System.in);
	   a=sc.nextInt();
	   num=a;
	   int rev = 0; 
	   int sum=0;
	   int r=0;
	    while(num > 0) 
	    {  r=num%10;
	    if(r%2==0) {
	    	sum=sum+r;
	    }
	        rev = rev*10 + r;
	        num = num/10; 
	    } 
	    if(rev==a && sum<25) {
	    	System.out.println(a+" is palindrome and the sum of even numbers is less than 25 ");
	    }
	    else if(rev==a && sum>25) {
	    	System.out.println(a+" is palindrome and the sum of even numbers is greater than 25");
	    }
	    else if(rev!=a) {
	    	System.out.println(a+" is not palindrome");
	    }
}
}
