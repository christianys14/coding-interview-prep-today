package main.java.IP.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * https://leetcode.com/problems/subsets/
 *
 * Given a set of distinct integers, nums, return all possible subsets (the power set).
 *
 * Note: The solution set must not contain duplicate subsets.
 *
 * Example:
 *
 * Input: nums = [1,2,3]
 * Output:
 * [
 *   [3],
 *   [1],
 *   [2],
 *   [1,2,3],
 *   [1,3],
 *   [2,3],
 *   [1,2],
 *   []
 * ]
 */

public class Subsets {


    public static List<List<Integer>> CombinationSet(int[] nums){
        List<Integer> slate = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        helper(nums,slate,0,result);
        return result;

    }


    public static void helper(int[] nums, List<Integer> slate, int index, List<List<Integer>> result) {

        if (index == nums.length) {
            result.add(new ArrayList<>(slate));
            return;
        }

        helper(nums, slate, index + 1, result);
        slate.add(nums[index]);
        helper(nums, slate, index + 1, result);
        slate.remove(slate.size() - 1);


    }

    public static void main(String[] args) {

        int[] input = new int[3];
        input[0] = 1;
        input[1] = 2;
        input[2] = 3;

        List<List<Integer>> result =  CombinationSet(input);

        System.out.println(result);
    }

}

