/* NOTE: 
    Trying to use an ArrayList instead of HashSet won't work
    due to a time limit exception (TLE) since the contains()
    method used with ArrayLists checks every element in the array, 
    whereas the contains() method for HashSets uses object's bucket
    location instead.
    ArrayList contains() method time complexity: O(n)
    HashSet contains() method time complexity: O(1) (constant time)

    More related info: https://www.baeldung.com/java-hashset-arraylist-contains-performance 
*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> list = new HashSet<Integer>();

        if(nums.length == 0){
            return false;
        }

        // Loop through array
        for(int i = 0; i < nums.length; ++i){
            // Check if hash set already has the current 
            // element being checked. If it does, then 
            // that's a duplicate
            if(list.contains(nums[i])) return true;

            // Build the hash set with current array element
            // to check for duplicates in next iteration
            list.add(nums[i]);
        }

        return false;
    }
}
