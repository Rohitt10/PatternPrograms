import java.util.Scanner;
class Pattern80
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENter odd Number:  ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0,k=0;j<n;j++)
			{
				if(i<=n/2 && j<=n/2+i && j>=n/2-i && (i+j)%2==0)
					System.out.printf("%c",65+k++);
				else if(i>n/2 && j>=i-n/2 && j<=n-i+n/2 && (i+j)%2==0)
					System.out.printf("%c",i-n/2+65);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}