import java.util.Scanner;
class Pattern31
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:  ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<i)
					System.out.print(" ");
				else
					System.out.print(j-i+1);
			}
			System.out.println();
		}
	}
}