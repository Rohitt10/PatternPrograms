import java.util.Scanner;
class Pattern44
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter odd number:  ");
		int n=sc.nextInt();
		for(int i=0;i<=n/2;i++)
		{
			int t=i;
			for(int j=0;j<n;j++)
			{
				if(j>=n/2-i &&j<=n/2)
					System.out.printf("%c",65+t--);
				else if(j>n/2 && j<=n/2+i)
					System.out.printf("%c",j-n/2+65);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}