package Assighnment2;

import java.util.ArrayList;
import java.util.List;

/// Leetcode 315. Count of Smaller Numbers After Self

public class CountSmallerAfterSelf24 {
    public List<Integer> countSmaller(int[] nums) {

        // this solution give Time limit exceed error
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }

            al.add(count);
        }

        return al;

        // approach 2 efficient

    }
    public static void main(String[] args) {
        CountSmallerAfterSelf24 obj = new CountSmallerAfterSelf24();
        int[] arr = {5, 2, 6, 1};
        System.out.println(obj.countSmaller(arr));
    }
}
