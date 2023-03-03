import java.util.Scanner;
class Pattern22
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		for(int i=0,j=65+n-1;i<n;i++,j--)
		{
			for(int k=n;k>i;k--)
				System.out.printf("%c",j);
			System.out.println("");
		}
	}
}