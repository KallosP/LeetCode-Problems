class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int counter = 0;
        int i;
        
        for(i = 0; i < str.length() / 2; ++i){ //only goes up to half the num
            if(str.charAt(i) == str.charAt(str.length() - i - 1)){
                ++counter;
            }
        }
        if(counter == (str.length() / 2)){
            return true;
        }
        else{
            return false;
        }
    }
}
