class Z5 
{
	public static void main(String[] args) 
	{
		System.out.println(Integer.toBinaryString(155));
		System.out.println(Integer.toBinaryString(376));
		System.out.println(155 | 376); // bitwise or
		System.out.println(155 & 376); // bitwise and
		System.out.println(155 ^ 376); // bitwise xor	
	}
}
/*        
         155    ==>    010011011
		 376    ==>    101111000
----------------------------------
bitwise   or    ==>    111111011   ==>  507



         155    ==>    010011011
		 376    ==>    101111000
----------------------------------
bitwise   or    ==>    000011000   ==>  24 



         155    ==>    010011011
		 376    ==>    101111000
----------------------------------
bitwise  xor    ==>    111100011   ==>  483

*/