/* Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.
Each number in candidates may only be used once in the combination.
Note: The solution set must not contain duplicate combinations.
Example 1:
Input: candidates = [10,1,2,7,6,1,5], target = 8
Output: 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]
Example 2:
Input: candidates = [2,5,2,1,2], target = 5
Output: 
[
[1,2,2],
[5]
]
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_II_40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        sum(candidates,target,list,new ArrayList<>(),0,0);
        return list;
    }
    public void sum(int [] arr,int t,List<List<Integer>> list,List<Integer> temp,int sum,int idx){
        if(sum==t){
            list.add(new ArrayList<>(temp));
            return;
        }
        if(sum>t){
            return;
        }
        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i-1]==arr[i]) continue;
            temp.add(arr[i]);
            sum(arr,t,list,temp,sum+arr[i],i+1);
            temp.remove(temp.size()-1);
        }
    }
}
