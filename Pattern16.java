import java.util.Scanner;
class Pattern16
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=n-1;j>=i;j--)
				System.out.print(i+1);
			System.out.println("");
		}
	}
}