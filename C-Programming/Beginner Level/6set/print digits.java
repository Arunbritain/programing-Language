
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String a;
		Scanner sc=new Scanner(System.in);
		a=sc.next();
		
		for(int i=0;i<a.length();i++)
		{
			System.out.print(a.charAt(i)+" ");
		}
	}
}