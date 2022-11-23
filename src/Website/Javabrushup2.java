package Website;

import java.util.ArrayList;

public class Javabrushup2 {

	public static void main(String[] args) {
ArrayList<String> a = new ArrayList<String>();
//class from java util package object = new class
//create object of the class = object.method
a.add("Kanchan");
a.add("Hitesh");
a.add("Chaudhari");
System.out.println(a.get(1));

for(int i=0; i<a.size(); i++)
{
System.out.println(a.get(i));	
}

//OR
for(String val: a)
	System.out.println(val);

//to check item is present in arraylist
	System.out.println(a.contains("Choudhary"));
//	----------------------------------------------------------------
	
	//string is an object //String literal

	// String s1 = "Rahul Shetty Academy";

	String s5 = "hello";

	//new

	String s2 = new String("Welcome");

	String s3 = new String("Welcome");

	String s = "Rahul Shetty Academy";

	String[] splittedString = s.split("Shetty");

	System.out.println(splittedString[0]);

	System.out.println(splittedString[1]);

	System.out.println(splittedString[1].trim());

	for(int i =s.length()-1;i>=0;i--)
//print reverse string 
	{
	System.out.println(s.charAt(i));
	}

	}

	
}
