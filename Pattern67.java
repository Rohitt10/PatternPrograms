import java.util.Scanner;
class Pattern67
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter odd Number:  ");
		int n=sc.nextInt();
		for(int i=0;i<=n/2;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j>=n/2-i && j<=n/2+i && (i+j)%2==0)
					System.out.printf("%c",i+65);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}