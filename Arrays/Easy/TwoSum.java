// Problem : 
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

 

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]
 

// Constraints:

// 2 <= nums.length <= 104
// -109 <= nums[i] <= 109
// -109 <= target <= 109
// Only one valid answer exists.

// Solution:
public class TwoSum {
    public int[] twoSum(int[] nums,int target){
        int result[] = new int[2];
        outerloop:
        for (int i=0;i<nums.length;i++){
            for (int j=(i+1);j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    result[0] = i;
                    result [1] = j;
                    break outerloop;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        int result[] = obj.twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }
}

// Time Complexity : O(n^2)
// since we are using two loops to iterate through the array of size n and n-1 respectively. Time complexity is O(n^2)