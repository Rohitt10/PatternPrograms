import java.util.Scanner;
class Pattern17
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=n,k=1;j>i;j--,k++)
				System.out.print(k);
			System.out.println("");
		}
	}
}