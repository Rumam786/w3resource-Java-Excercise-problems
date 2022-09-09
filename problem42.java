// Write a Java program to insert a word in the middle of the another string.
// Insert "Tutorial" in the middle of "Python 3.0", so result will be Python Tutorial 3.0
// Sample Output:

// Python Tutorial 3.0






class problem42 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Python 3.0");
        System.out.println(sb);
        sb.insert(7,"Tutorial ");
        System.out.println(sb);
    }
}
