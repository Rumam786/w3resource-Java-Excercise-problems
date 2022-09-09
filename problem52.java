// Write a Java program to create a new array of length 2 from two arrays of integers with 
// three elements and the new array will contain the first and last elements from the two arrays.



import java.util.Arrays;
class problem52 {
    public static void main(String[] args) {
        int[] array1 = {50,10,20};
        int[] array2 = {20,10,50};
        System.out.println("Array1 is : "+Arrays.toString(array1));
        System.out.println("Array2 is : "+Arrays.toString(array2));
        int[] new_array = {array1[0],array2[1]};
        System.out.println("New Array is : "+Arrays.toString(new_array));
    }
}
