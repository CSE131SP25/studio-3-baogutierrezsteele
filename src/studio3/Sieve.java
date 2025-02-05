package studio3;
import java.util.Scanner;

public class Sieve {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("What's n?");
	 int n = in.nextInt();
	 boolean [] arrayLength = new boolean [n];
	 for (int i = 0; i < arrayLength.length; i++) {
		 arrayLength[i] = true;
	 }
	 
	 for (int i = 2; i < arrayLength.length; i++) {
		 if (arrayLength[i]) {
			 int x = 0;
			 for ( int j = (i*i); j < arrayLength.length; j+=i) {
				 arrayLength[j]=false;
			 } 
		 }
	 }
	 for (int i = 0; i < arrayLength.length; i++) {
		 if (arrayLength[i]) {
			 System.out.println(i);
		 }
	 }
	}
}
