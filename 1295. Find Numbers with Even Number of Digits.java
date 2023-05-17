class Solution {
    public int findNumbers(int[] nums) {
        int ctr = 0;

        for(int i = 0; i < nums.length; ++i){
            
            int currNum = nums[i];
            String strNum = Integer.toString(currNum);
            
            if(strNum.length() % 2 == 0){
                ++ctr;
            }

        }

        return ctr;

    }
}
