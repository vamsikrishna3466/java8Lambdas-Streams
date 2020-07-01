package taskthree;

public final class PalindromeCheck 
{
	private PalindromeCheck()
	{
		throw new IllegalStateException("PalindromeCheck class");
	}
	public static boolean check(String value)
	{
		int len=value.length();
		for(int i=0;i<len/2;i++)
		{
			if(value.charAt(i)!=value.charAt(len-i-1))
				return false;
		}
		return true;
	}

}
