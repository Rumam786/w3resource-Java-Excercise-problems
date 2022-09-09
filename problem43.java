// Write a Java program to create a new string of 4 copies of the last 3 characters of the original string.
// The length of the original string must be 3 and above.
// Sample Output:

// 3.3.3.




class problem43 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Python Tutorial 3");
        sb.delete(0,16);
        System.out.print(sb+".");
        System.out.print(sb+".");
        System.out.print(sb);
    }
}