import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,sum=0,i;
		System.out.println("enter the limit");
		n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
		    sum=sum+i;
		}
		System.out.println("Sum of "+n+ " natural numbers is :" + sum);
	}
}

