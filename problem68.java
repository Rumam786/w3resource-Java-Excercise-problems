// Write a Java program to count the number of even and odd elements in a given array of integers.




import java.util.*;
class problem68 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int ctr_even = 0, ctr_odd = 0;
        System.out.println("Original Array"+Arrays.toString(nums));
        for (int i = 0;i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                ctr_even++;
            } else 
            ctr_odd++;
        }
        System.out.printf("\nNumbers of Even Elements in Array is :%d",ctr_even);
        System.out.printf("\nNumbers of Odd Elements in Array is :%d",ctr_odd);
    }
}