class Z6
{
	public static void main(String[] args) 
	{
		System.out.println(Integer.toBinaryString(155));
		System.out.println(Integer.toBinaryString(376));
		System.out.println(155 | 376); // bitwise or
		System.out.println(155 & 376); // bitwise and
		System.out.println(155 ^ 376); // bitwise xor	
		System.out.println(155 >> 1); // bitwise right shift by one	
		System.out.println(155 >> 2); // bitwise right shift by two
		System.out.println(155 << 1); // bitwise left shift by one
		System.out.println(155 << 2); // bitwise left shift by two
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


         155    ==>    010011011
155 >> 1        ==>     01001101   ==>   77


         155    ==>    010011011
155 >> 2        ==>      0100110   ==>   38


         155    ==>    010011011
155 << 1        ==>   0100110110   ==>   310


         155    ==>    010011011
155 << 2        ==>  01001101100   ==>   620

*/