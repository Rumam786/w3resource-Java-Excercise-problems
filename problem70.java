import java.util.Arrays;

// Write a Java program to check if the number of 10 is greater than number to 20s in a given array of integers.





class problem70 {
    public static void main(String[] args) {
        int[] array_nums = {10,20,10,20,10,30,40,50};
        System.out.println("Original Array  "+Arrays.toString(array_nums));
        int ctr1 = 0;
        int ctr2 = 0;
        for (int i = 0;i < array_nums.length; i++) {
            if (array_nums[i] == 10)
            ctr1++;
            if (array_nums[i] == 20)
            ctr2++;
        }
        System.out.println(ctr1 > ctr2);
    }
}