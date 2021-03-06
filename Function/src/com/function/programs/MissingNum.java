package com.function.programs;

//Java program to find missing Number
import java.util.*;
import java.util.Arrays;

public class MissingNum {
	public static int findDisappearedNumbers(int[] nums) {
		int n = nums.length;

		int sum = ((n + 1) * (n + 2)) / 2;
		System.out.println(sum);
		for (int i = 0; i < n; i++)
			sum -= nums[i];
		return sum;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 5, 6 };
		System.out.println(findDisappearedNumbers(a));
	}
}
