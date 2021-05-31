package Test;

import java.util.Scanner;

public class Datatypes {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        System.out.println("Hello World");
        int a,b,c;
        a=b=5;
        float e=2,d=(float) 22.345, s;
        c=a+b;
        System.out.println("Sums :"+ c);
        c=a*b;
        s=e+d;
        System.out.println("Product :"+ c);
        System.out.println("Decimal sum :"+ s);
        System.out.println("Enter your name:");
        Scanner sc =new Scanner(System.in);
        String name = sc.next();
        System.out.println("You are : "+name);
        sc.close();
        int array[] = {1,2,3,4,5,6};
        System.out.println("array[4] : "+array[4]);
        
    }

}
