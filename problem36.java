// Write a Java program to find the penultimate (next to last) word of a sentence.




import java.util.Scanner;
class problem36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a line");
        String line = sc.nextLine();
        String[] words = line.split("[ ]+");
        System.out.println("Penultimate word is : "+words[words.length -2]);
    }
}