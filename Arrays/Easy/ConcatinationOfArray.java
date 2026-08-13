import java.util.Arrays;

public class ConcatinationOfArray{
    public int[] getConcatination(int[] nums){
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i=0;i<n;i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }


public static void main(String[] args){
    ConcatinationOfArray obj = new ConcatinationOfArray();
    int nums[] = {1,2,3,4};
    int result[] = obj.getConcatination(nums);
    System.out.println(Arrays.toString(result));
}
}