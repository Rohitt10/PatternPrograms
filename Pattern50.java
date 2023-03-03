import java.util.Scanner;
class Pattern50
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter odd number:  ");
		int n=sc.nextInt();
		for(int i=0;i<=n/2;i++)
		{
			int k=1;
			for(int j=0;j<n;j++)
			{
				if(j>=i && j<=n-i-1)
					System.out.print(k++);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}