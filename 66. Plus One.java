class Solution {
    public int[] plusOne(int[] digits) {
		
		for(int i = digits.length - 1; i >= 0; --i){
            
            if(digits[i] < 9){ //if last digit is not 9, just increment and return
                digits[i]++;
                return digits;
            }
            
            digits[i] = 0; //if last digit is 9 then make it 0 and loop until non nine number is reached
            
        } 
        
        int[] newNum = new int[digits.length + 1]; //if amount of digits change from increment, then account for that
        newNum[0] = 1; //means all digits were 9's which means after incrementing, the first digit is a 1
        return newNum;
        
    }
}
