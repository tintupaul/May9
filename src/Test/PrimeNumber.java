package Test;

import java.util.Scanner;

//import oopsConcepts.ClassA;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
 // TODO Auto-generated method stub
        
        int temp;
        boolean isPrime=true;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();
        
        for(int i=2;i<=num/2;i++)
        {
               temp=num%i;
           if(temp==0)
           {
              isPrime=false;
              break;
           }
        }
        scanner.close();
        //If isPrime is true then the number is prime else not
        if(isPrime)
           System.out.println("Number is Prime num : " + num);
        else
           System.out.println("Number is not Prime : " + num);
       
    	}
	
	

}

