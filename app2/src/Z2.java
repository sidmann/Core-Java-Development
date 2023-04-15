class Z2 
{
	public static void main(String[] args) 
	{
		int i = 98;
		int j = 425;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toBinaryString(j));
	}
}

/*  
      98 / 2 = 49 + r0
	  49 / 2 = 24 + r1
	  24 / 2 = 12 + r0
	  12 / 2 = 6  + r0
	   6 / 2 = 3  + r0
	   3 / 2 = 1  + r1
	   1 / 2 = 0  + r1
	   ----------------
	                 1100010


     425 / 2 = 212 + r1
	 212 / 2 = 106 + r0
	 106 / 2 =  53 + r0
	  53 / 2 =  26 + r1
	  26 / 2 =  13 + r0
	  13 / 2 =   6 + r1
	   6 / 2 =   3 + r0
	   3 / 2 =   1 + r1
	   1 / 2 =   0 + r1
	   -----------------
	                  110101001


