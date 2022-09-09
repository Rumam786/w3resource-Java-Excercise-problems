// Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.




import java.util.Scanner;
class problem39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Type First Number");
        int a = sc.nextInt();
        System.out.println("Type Second Number");
        int b = sc.nextInt();
        int divide = a / b;
        int result = a - (divide * b);
        System.out.println("Result is : "+result);
    }
}