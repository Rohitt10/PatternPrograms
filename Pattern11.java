import java.util.Scanner;
class Pattern11
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
				System.out.print(i+1);
			System.out.println("");
		}
	}
}