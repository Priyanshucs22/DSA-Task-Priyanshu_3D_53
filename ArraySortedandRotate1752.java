/*Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.
There may be duplicates in the original array.
Note: An array A rotated by x positions results in an array B of the same length such that A[i] == B[(i+x) % A.length], where % is the modulo operation.
Example 1:
Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].
Example 2:
Input: nums = [2,1,3,4]
Output: false
Explanation: There is no sorted array once rotated that can make nums.
Example 3:
Input: nums = [1,2,3]
Output: true
Explanation: [1,2,3] is the original sorted array.
You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.
Constraints:
1 <= nums.length <= 100
1 <= nums[i] <= 100 */ 
public class ArraySortedandRotate1752 {
    public  boolean check(int[] nums) {
        int len = nums.length;
        int i=1;
        boolean flag = false;
        while(i<len){
            int f =1;
            int temp=nums[len-1];
            for(int j=len-1;j>0;j--){
                nums[j]=nums[j-1];
            }
            nums[0]=temp;
            for(int k=0;k<len-1;k++){
                if(nums[k]>nums[k+1]){
                    f=0;
                }
            }
            if(f==1){
                flag=true;
                break;
            }
        }
        return flag;
    }
    public static void main(String [] args ){
        ArraySortedandRotate1752 Ar = new ArraySortedandRotate1752();
        int nums[]={3,4,5,1,2};
        System.out.println(Ar.check(nums));
        int nums2[]={2,1,3,4};
        System.out.println(Ar.check(nums2));
    }
}
