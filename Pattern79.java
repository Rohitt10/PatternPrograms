import java.util.Scanner;
class Pattern79
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter odd Number:  ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i<=n/2 && j<=n/2+i && j>=n/2-i && (i+j)%2==0)
					System.out.printf("%c",65+i);
				else if(i>n/2 && j>=i-n/2 && j<=n-i+n/2 && (i+j)%2==0)
					System.out.printf("%c",n-i+64);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}