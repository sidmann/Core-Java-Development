class R 
{
	int i;
	static R test(R r1)
	{
		R obj = new R();
		obj.i = r1.i + 20;
		return obj;
	}
	public static void main(String[] args) 
	{
		R ref = new R();
		ref.i = 100;
		R myRef = test(ref);
		System.out.println(ref.i);
		System.out.println(myRef.i);
	}
}
