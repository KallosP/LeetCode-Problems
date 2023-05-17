class Solution {
    public int lengthOfLastWord(String s) 
    {
		String[] split = s.split(" ");
		
		for(int i = split.length - 1; i >= 0; --i) 
		{
			if(split[i] == " ") {
			}
			else 
			{
				return split[i].length();
			}
		}
		return -1;
    }
}
