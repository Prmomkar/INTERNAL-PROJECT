package sampleproject;

import java.util.Scanner;

public class Array {
	    public static void main(String[] args){

	        Scanner input = new Scanner(System.in);

	        long amt;
	        
	        System.out.println("enter your budget:");
	        amt = input.nextLong();
	        
	        if (amt >= 18) {
	        	  System.out.println("Your amt " + amt + " is greater than or equal to 18, you can enter");
	        	}
	        	
	        	if (amt < 18) {
	        	  System.out.println("Your amt " + amt + " is less than 18, you can't enter");  
	        } 
	    }
	}




//Updated
	