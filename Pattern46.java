import java.util.Scanner;
class Pattern46
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter odd Number:  ");
		int n=sc.nextInt();
		for(int i=0;i<=n/2;i++)
		{
			int k=0;
			for(int j=0;j<=n;j++)
			{
				if(j>=n/2-i && j<=n/2)
					System.out.print(++k);
				else if(j>n/2 && j<=n/2+i)
					System.out.print(--k);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}