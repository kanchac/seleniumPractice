package Website;

import java.util.Scanner;

public class JavaTest2 {  
  
   public static void main(String[] args) {  
       Scanner s = new Scanner(System.in);  
       System.out.print("Enter a number : ");  
       int number = s.nextInt();  
       if (isPrime(number)) {  
           System.out.println(number + " is a prime number");  
       } else {  
           System.out.println(number + " is not a prime number");  
       }  
   }  
  
   public static boolean isPrime(int number) {
	    
	   if(number <= 1)
		   return false;
	    
	   else if (number == 2)
	        return true;    
	    
	   else if(number % 2 == 0)
	        return false;
	    
	    
	    for (int i = 3; i <= Math.sqrt(number); i+= 2) {
	        if (number % i == 0)
	            return false;
	        
	    }
	    
	    return true;
	} 
} 
