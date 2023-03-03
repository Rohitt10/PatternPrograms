import java.util.Scanner;
class Pattern73
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter odd Number:  ");
		int n=sc.nextInt();
		for(int i=0;i<=n/2;i++)
		{
			for(int j=0,t=65+n/2-i;j<n;j++)
			{
				if(j>=i && j<n-i && (i+j)%2==0)
					System.out.printf("%c",t--);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}