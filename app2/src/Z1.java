class Z1 
{
	public static void main(String[] args) 
	{
		int i = 47;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.parseInt("101111",2));
		System.out.println(Integer.parseInt("101111"));
	}
}

/*
  47 / 2 = 23 + r1
  23 / 2 = 11 + r1
  11 / 2 =  5 + r1
   5 / 2 =  2 + r1
   2 / 2 =  1 + r0
   1 / 2 =  0 + r1
   ------------------
                101111


   101111

   101111 = (2 power 0) * 1 +
            (2 power 1) * 1 +
            (2 power 2) * 1 +
            (2 power 3) * 1 +
            (2 power 4) * 0 +
            (2 power 5) * 1 =
			------------------
			= 1 + 2 + 4 + 8 + 0 + 32 = 47

