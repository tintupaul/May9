package Test;

import java.util.Scanner;

public class evenNum {
	public static void main(String[] args) {
		int i;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		if(i%2==0)			
			
			System.out.println("Even num");
		else
			System.out.println("Odd num");
		sc.close();
	
/*		for (i=1;i<=30;i++)
		{ 
			if(i%2==0)
			System.out.println(i);
		}*/
	}
}
