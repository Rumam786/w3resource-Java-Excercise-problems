// Write a Java program that takes two numbers as input and display the product of two numbers




import java.util.Scanner;
class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type First Number");
        int a = sc.nextInt();
        System.out.println("Type Second Number");
        int b = sc.nextInt();
        System.out.print("Your Answer is ");
        int sum = a*b;
        System.out.println(sum);
    }
}