package lc.one;

import java.util.*;

/**
 *
 * @author fanwenjie415
 * @date 2019-03-17
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
public class TwoSum  {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] nums2 = new int[]{3,2,4};
        int[] nums3 = new int[]{3,3};


        long st = System.currentTimeMillis();

        final Solution1 solution = new Solution1();
        for (int i = 0; i < 1; i++) {
            final int[] ints = solution.twoSum(nums3, 6);
            StringBuilder sb  = new StringBuilder();
            for (int j = 0; j < ints.length; j++) {
                sb.append(ints[j]);
                sb.append(" ");
            }

            System.out.println("Output: " + sb);
        }
        long et = System.currentTimeMillis();
        System.out.println("cost : " + (et - st) + " ms");
    }
}

class Solution1 {
    public int[] twoSum(int[] nums, int target) {

        LinkedList<Integer> dataSet = new LinkedList<>();
        for (int num : nums) {
            dataSet.add(num);
        }

        for (int i = 0; i < nums.length; i++) {
            final int i1 = dataSet.indexOf(target - nums[i]);
            if ( i1 >= 0 &&i1 != i){

                return new int[]{i, i1};
            }
        }
        return new int[]{};
    }
}


class Solution2 {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new LinkedHashMap<>(nums.length);
        for (int j = 0; j < nums.length; j++) {
            map.put(nums[j], j);
        }

        for (int i = 0; i < nums.length; i++) {
            final int index = map.getOrDefault(target - nums[i], -1);
            if (index > -1 && index != i) {

                return new int[]{i, index};
            }
        }
        return new int[]{};
    }
}
