import java.util.Scanner;
class Pattern40
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter odd number:  ");
		int n=sc.nextInt();
		for(int i=1,k=1;i<=n;i+=2,k++)
		{
			int t=i;
			for(int j=0;j<=8;j++)
			{
				if(j>n/2-k && j<n/2+k)
					System.out.print(t--);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}