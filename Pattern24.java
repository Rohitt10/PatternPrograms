import java.util.Scanner;
class Pattern24
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=n-1;j>=0;j--)
			{
				if(j<=i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
}