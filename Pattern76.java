import java.util.Scanner;
class Pattern76
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
					System.out.print(i+1);
				else if(i>n/2 && j>=i-n/2 && j<=n-i+n/2 && (i+j)%2==0)
					System.out.print(n-i);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}	
					