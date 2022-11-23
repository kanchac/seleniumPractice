package Website;

public class JavaBrushup {

	public static void main(String[] args) {
//		int myNum = 5;
//
//		String website = "Rahul Shetty Academy";
//
//		char letter = 'r';
//
//		double dec = 5.99;
//
//		boolean myCard = true;
//
//
//
//		System.out.println(myNum+"is the value stored in the myNum variable");
//
//		System.out.println(website);
int[] arr = new int[5];
arr[0] = 1;
arr[1] = 2;
arr[2] = 3;
arr[3] = 4;
arr[4] = 5;

// different way to initialize array --- int[] arr2 = {1,2,3,4,5};

int sum = arr[0] + arr[2];
System.out.println("Addition of two number is:"+ sum);

int[] arr2 = {1,2,4,5,8,10,122};
for(int i=0; i<arr.length; i++)
{
	System.out.println("values of second array are:" + arr2[i]);
}

String[] name = {"Kanchan", "Raman", "Chaudhari"};
for(int i=0; i<name.length; i++)
System.out.println(name[i]);
//OR 
for(String s: name)
System.out.println(s);
 
//------------------------------------
//output - 2,4,8,... multiple of 2
for(int i=0; i<arr2.length;i++)
{
	if(arr2[i] % 2 == 0)
	{
System.out.println(arr2[i]);	
	}

else
{
System.out.println("Value which is not multiple of 2 is: " + arr2[i]);	
}
	}

}
}
