package com.example.lab2;

public class MaxSubarraySum
{
    Integer[] nums;

    public MaxSubarraySum(Integer[] nums)
    {
        if (nums == null || nums.length == 0)
        {
            throw new IllegalArgumentException("Array can't be empty");
        }

        this.nums = nums;
    }

    // Kadane's algorithm
    public Integer execute()
    {
        Integer maxSum = nums[0];
        Integer currentSum = nums[0];

        for (int i = 1; i < nums.length; i++)
        {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}