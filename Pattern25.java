import java.util.Scanner;
class Pattern25
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>0;j--)
			{
				if(j>i)
					System.out.print(" ");
				else
					System.out.print(i);
			}
			System.out.println("");
		}
	}
}