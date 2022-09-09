// Write a Java program to test if 10 appears as either the first or last element of an array of integers.
// The length of the array must be greater than or equal to 2.



class problem49 {
    public static void main(String[] args) {
        int[] num_array = {10,2,3,4,5,6,7,10};
        System.out.print("Result is : ");
        System.out.println(num_array[0] == 10 || num_array[num_array.length -1] == 10 );
    }
}