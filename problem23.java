// Write a Java program to reverse a string.


// Write Program to reverse a string.



import java.util.Scanner;
class problem23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Type Word");
        char[] letters = sc.nextLine().toCharArray();
        System.out.println("Reverse String");
        for (int i = letters.length - 1; i >=0; i--) {
        System.out.print(letters[i]);
        }
    }
}