import java.util.Scanner;
class Pattern49
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter odd number:  ");
		int n=sc.nextInt();
		for(int i=0,k=0;i<n;i+=2,k++)
		{
			for(int j=0;j<n;j++)
			{
				if(j>=k && j<=n-k-1)
					System.out.print(n-i);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}