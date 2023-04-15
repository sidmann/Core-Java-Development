class O
{
	O()
	{
		this(false);
		System.out.println("O()");
	}
	O(boolean b1)
	{
		System.out.println("O(boolean)");
	}
	public static void main(String[] args) 
	{
		O o1 = new O(true);
		System.out.println("--------");
		O o2 = new O();
	}
}
