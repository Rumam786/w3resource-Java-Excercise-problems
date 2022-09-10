// Write a Java program to find the largest element between first, last, and middle values 
// from an array of integers (even length).




import java.util.Arrays;
class problem57 {
    public static void main(String[] args) {
        int[] array_nums = {10,20,30,40,50,60,70};
        System.out.println("Original Array is : "+Arrays.toString(array_nums));
        int max_val = array_nums[0];
        if (max_val <= array_nums[array_nums.length-1]) {
            max_val = array_nums[array_nums.length-1];
        } if (max_val <= array_nums[array_nums.length/2]) {
            max_val = array_nums[array_nums.length/2];
        }
        System.out.println("Large Value is : "+max_val);
    }
}
