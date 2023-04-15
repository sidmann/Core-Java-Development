class  A
{
	int i;
	int j;
}
class F extends A
{
	int x;
	int y;
	public static void main(String[] args) 
	{
		F f1 = new F();
		System.out.println(f1.i);
		System.out.println(f1.j);
		System.out.println(f1.x);
		System.out.println(f1.y);
	}
}
