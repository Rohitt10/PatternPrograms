import java.util.Scanner;
class Pattern19
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=n,k=65;j>i;j--,k++)
				System.out.printf("%c",k);
			System.out.println("");
		}
	}
}