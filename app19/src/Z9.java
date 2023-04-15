import java.util.Scanner;
class Z9
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("enter some thing");
			String s1 = sc.next();
			System.out.println(1);
			int i = Integer.parseInt(s1);
			System.out.println(2);
			int j = i / (i - 9);
			System.out.println(3);
		}
		catch (NumberFormatException ex)
		{
			System.out.println("NumberFormatException handled");
		}
		finally
		{
			System.out.println("from final");
		}
		System.out.println("main end");
	}
}
