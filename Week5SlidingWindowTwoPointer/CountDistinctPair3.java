package Week5SlidingWindowTwoPointer;

public class CountDistinctPair3 {

    public static int totalPairs(int[] nums, int k) {
        //1. naive
        int ans = 0;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                int res = Math.abs(nums[i] - nums[j]);
                
                if(res ==  k){
                    ans++;
                }
            }
        }
        
        return ans;
        
    }

    public static void totalPairs2(int nums[], int k){

    }

    public static void main(String[] args) {
        
    }
}
