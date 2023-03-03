import java.util.Scanner;
class Pattern4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		int n=sc.nextInt();
		for(int i=65;i<(65+n);i++)
		{
			for(int j=0;j<n;j++)
				System.out.printf("%c",i);
			System.out.println("");
		}
	}
}