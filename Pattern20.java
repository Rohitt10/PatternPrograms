import java.util.Scanner;
class Pattern20
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		for(int i=0,j=n;i<n;i++,j--)
		{
			for(int k=n;k>i;k--)
				System.out.print(j);
			System.out.println("");
		}
	}
}