class W
{
	void test()
	{
		System.out.println("from test: " + this); //to wherever w1 is pointing with the same "this" also pointing.
	}
	public static void main(String[] args) 
	{
		W w1 = new W();
		System.out.println("from main: " + w1);
		w1.test();
	}
}
/* from main: W@452b3a41
   from test: W@452b3a41
   W@452b3a41 -"this" memory location
*/