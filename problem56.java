// Write a Java program to swap the first and last elements of an array (length must be at least 1) and create a new array.




import java.util.Arrays;
class problem56 {
    public static void main(String[] args) {
        int[] array_nums = {10,20,30,40};
        System.out.println("Original Array"+Arrays.toString(array_nums));
        int x = array_nums[0];
        array_nums[0] = array_nums[array_nums.length-1];
        array_nums[array_nums.length-1] = x;
        System.out.println("After Swapp"+Arrays.toString(array_nums));
    }
}
