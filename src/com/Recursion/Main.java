package com.Recursion;

public class Main {

    public static void main(String[] args) {
	// leetcode program to find max xor btw two elements.
        int[] arr = {8,9,5,6,3,1};
        System.out.println(xor(arr));
        }
        public static int xor(int[] nums){
        int max=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j< nums.length;j++){
                if((nums[i]^nums[j])>max){
                    max = nums[i]^nums[j];
                }
            }
        }
        return max;
        }
}
