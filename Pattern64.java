import java.util.Scanner;
class Pattern64
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENter odd Number: ");
		int n=sc.nextInt();
		for(int i=0;i<=n/2;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j>=n/2-i && j<=n/2+i)
				{
					if((j+i)%2==0)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}