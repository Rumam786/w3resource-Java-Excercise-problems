// Write a Java program to reverse a word.



import java.util.Scanner;
class problem37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a word");
        char[] letters = sc.nextLine().toCharArray();
        System.out.println("Reverse Word");
        for (int i = letters.length -1; i >=0; i--) {
            System.out.print(letters[i]);
        }
    }
}