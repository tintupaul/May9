package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;


public class CollectionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> mylist = new ArrayList<String>();
		
		mylist.add("Raj");
		mylist.add("Kiran");
		mylist.add("Srikanth");
		mylist.add("Priya");
		
		System.out.println("Before Sorting");
		System.out.println(mylist);
		
		Collections.sort(mylist);
		
		System.out.println("After Sorting");
		System.out.println(mylist);
		
		Collections.sort(mylist,Collections.reverseOrder());
		
		System.out.println("After Descending Order");
		System.out.println(mylist);
		
		
		
		Stack<String> mystack = new Stack<String>();
		
		mystack.push("abc");
		mystack.push("xyz");
		mystack.push("pqr");
		mystack.pop();
		
		System.out.println(mystack);
		
		//some changes

	}

}