// Write a Java program to get the larger value between first and last element of an array (length 3) of integers .
// Sample Output:

// Original Array: [20, 30, 40]                                           
// Larger value between first and last element: 40 




class problem55 {
    public static void main(String[] args) {
        int[] num_array = {10,20,30};
        System.out.println("Array"+num_array);
        int min_value = num_array[0];
        int max_value = num_array[2];
        if (max_value >= min_value) {
            min_value = max_value;
            System.out.println("Maximun value is : "+max_value);
        }
    }
}