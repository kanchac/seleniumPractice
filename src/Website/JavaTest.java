package Website;

import java.util.Scanner;

public class JavaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myobj = new Scanner(System.in);
		String dup;
		System.out.println("Enter the String:");
		dup = myobj.nextLine();
//		System.out.println("String is:" + dup);
		char[] num = dup.toCharArray();
		
		System.out.println("Duplicate characters are:");
		
		for(int i=0;i<dup.length();i++)
		{
			int count=1;
			for(int j=i+1;j<dup.length();j++)
			{
				if(num[i] == num[j] && num[i]!= ' ')
				
				{
					
					
					count++;
					num[j] = 0;
				}
				
			}	
			if(count > 1 && num[i]!= 0)
				System.out.println(num[i] + "="+ count );
		
		}
		

	}

}
