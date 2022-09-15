/*Write a Java program than input an integer less than 11 and print the integer in English.
and if integer is greater than 11 then throw and exception.
*/




import java.util.Scanner;
class problem62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number less than 11");
        int n = sc.nextInt();
        if (n < 11) {
            String[] number = {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
            System.out.println(number[n]);
        } else if (n >=11) {
            throw new ArithmeticException("Type a Number between 1 and 10");
        }
    }
}