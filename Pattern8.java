import java.util.Scanner;
class Pattern8
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		for(int i=65+n-1;i>64;i--)
		{
			for(int j=0;j<n;j++)
				System.out.printf("%c",i);
			System.out.println("");
		}
	}
}