import java.util.Scanner;
class Pattern3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=n;j++)
				System.out.print(j);
			System.out.println("");
		}
	}
}