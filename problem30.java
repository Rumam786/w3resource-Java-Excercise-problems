// Write a Java program to convert a string to an integer in Java.




import java.util.Scanner;
class problem30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Input a number (String)");
        String chr = sc.nextLine();
        int num = Integer.parseInt(chr);
        System.out.printf("The Integer Value is %d",num);
    }
}
