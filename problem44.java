// Write a Java program to extract the first half of a string of even length.
// Test Data: Python
// Sample Output:
// Pyt




class problem44 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Python");
        sb.delete(3,6);
        System.out.println("Result  : "+sb);
    }
}
