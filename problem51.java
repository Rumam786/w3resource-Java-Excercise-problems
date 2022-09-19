// Write a Java program to test if the first or the last element of two array of integers are same.
// The length of the array must be greater than or equal to 2.
// Test Data: array1 = 50, -20, 0, 30, 40, 60, 12
// array2 = 45, 20, 10, 20, 30, 50, 11
// Sample Output:

// false




class problem51 {
    public static void main(String[] args) {
        int[] num_array2 = {50,10,20,30,45,56,10};
        int[] num_array3 = {30,20,40,70,34,56,20};
        System.out.print("Result is : ");
        System.out.println(num_array2[0] == num_array3[0] || num_array2[num_array2.length -1] == num_array3[num_array3.length -1] );
    }
}
