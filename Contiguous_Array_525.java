/*Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.
Example 1:
Input: nums = [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.
Example 2:
Input: nums = [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
Constraints:
1 <= nums.length <= 105
nums[i] is either 0 or 1 */

import java.util.HashMap;
import java.util.Map;

public class Contiguous_Array_525 {
    public int findMaxLength(int[] nums) {
        int sum =0, maxlen= 0;
        Map<Integer,Integer> hashmap = new HashMap<>();
        hashmap.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i]==0?-1:1;
            if(hashmap.containsKey(sum)){
                maxlen=Math.max(maxlen,i-hashmap.get(sum));
            }
            else{
                hashmap.put(sum,i);
            }
        }
        return maxlen;
    }
}
