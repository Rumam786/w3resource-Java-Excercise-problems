// Write a Java program to test if the first and the last element of an array of integers are same.
// The length of the array must be greater than or equal to 2.
// Test Data: array = 50, -20, 0, 30, 40, 60, 10
// Sample Output:

// false



class problem50 {
    public static void main(String[] args) {
        int[] num_array2 = {50,10,20,30,45,56,10};
        System.out.print("Result is : ");
        System.out.println(num_array2[0] == 50 && num_array2[6] == 50 );
    }
}
