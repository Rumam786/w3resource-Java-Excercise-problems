// Write a Java program to multiply corresponding elements of two arrays of integers. 





import java.util.Arrays;
class problem58 {
    public static void main(String[] args) {
        int[] left_array = {10,20,30,40,50};
        int[] right_array = {20,30,40,50,60};
        String result = "";
        System.out.println("Left Array is : "+Arrays.toString(left_array));
        System.out.println("Right Array is : "+Arrays.toString(right_array));
        for (int i = 0;i < left_array.length; i++) {
            int num1 = left_array[i];
            int num2 = right_array[i];
            result += Integer.toString(num1 * num2)+" ";
        }
        System.out.println("Multiplication of corresponding elements is : "+result);
    }
}
