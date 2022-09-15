/*Write a Java program than input two integers and calculate the sum and then print the sum in English.*/





import java.util.Scanner;
class problem63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number less then 10");
        int a = sc.nextInt();
        System.out.println("Type a number less then 10");
        int b = sc.nextInt();
        int sum = a+b;
        if (a >= 10) {
            throw new ArithmeticException("Type a number less then 10");
        } if (b >= 10) {
            throw new ArithmeticException("Type a number less then 10");
        } else {
            String[] number = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eightteen","nineteen"};
            System.out.println("Sum of a and b is : "+number[sum]);
        }
    }
}
