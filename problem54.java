// Write a Java program to rotate an array (length 3) of integers in left direction.
// Sample Output:

// Original Array: [20, 30, 40]                                           
// Rotated Array: [30, 40, 20]





import java.util.Arrays;
class problem54 {
    public static void main(String[] args) {
        int[] array_nums = {10,20,30};
        System.out.println("Original Array is : "+Arrays.toString(array_nums));
        int[] new_array = {array_nums[2],array_nums[1],array_nums[0]};
        System.out.println("Reflected array is : "+Arrays.toString(new_array));
    }
}
