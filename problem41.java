// Write a Java program to print first 3 letters of string.




class problem41 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Python 3.0");
        sb.delete(3,sb.length());
        System.out.println(sb);
    }
}
