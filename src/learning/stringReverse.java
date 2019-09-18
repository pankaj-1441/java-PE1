package learning;
import java.util.Scanner;

public class stringReverse {
public static void main(String[] args) {
	String str;
	System.out.println("Enter any string to get reverse string : ");
	Scanner sc=new Scanner(System.in);
	str=sc.next(); 
	char[] s=str.toCharArray();
	for(int i=s.length-1;i>=0;i--) {
	System.out.print(s[i]);
	}
	
}
}
