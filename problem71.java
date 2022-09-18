// Write a Java program to check if a specified array of integers contains 10 or 20.



import java.util.Arrays;
class problem71 {
    public static void main(String[] args) {
        int[] array_nums = {11,12,14,15,16,17,18,19};
        System.out.println("Original Array  "+Arrays.toString(array_nums));
        int result = 0;
        for (int i = 0;i < array_nums.length; i++) {
            if (array_nums[i] == 10 && array_nums[i] == 20) {
                result = 1;
            }
        }
        if (result == 1) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}