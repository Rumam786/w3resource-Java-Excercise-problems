// Write a Java program to insert a word in the middle of the another string.




class problem40 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Python 3.0");
        sb.insert(7,"Tutorial ");
        System.out.println(sb);
    }
}