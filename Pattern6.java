import java.util.Scanner;
class Pattern6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The NUmber");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j=0;j<n;j++)
				System.out.print(i);
			System.out.println("");
		}
	}
}