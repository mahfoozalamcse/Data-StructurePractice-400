package Assighnment2;
// leet code 162 find pick element

public class PeekElementLeetcode6 {
    public static int peek(int nums[]){
        int left = 0, right = nums.length-1;

        while (left < right) {
            int mid = left + (right - left)/2;

            if (nums[mid] < nums[mid+1]) {
                left = mid+1;
            }else{
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {
       int nums[] = {1,2,1,3,5,6,4};
       System.out.println(" Peek element : "+ peek(nums));

    }
}
