import java.util.Scanner;
class Pattern42
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter odd Number:  ");
		int n=sc.nextInt();
		for(int i=1,k=0;i<=n;i+=2,k++)
		{
			int t=i;
			for(int j=0;j<n;j++)
			{
				if(j>=n/2-k && j<=n/2+k)
					System.out.printf("%c",64+(t--));
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}