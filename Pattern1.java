package Patterns;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(4);
		

	}
	static void print(int n)
	{
		int a=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n+1-i;j++)
			{
				System.out.print(j);
			}
			for(int k=1;k<=a;k++)
			{
				System.out.print("*");
			}
			a=a+2;
			for(int l=n+1-i;l>=1;l--)
			{
				System.out.print(l);
			}
			System.out.println();
		}
	}

}
