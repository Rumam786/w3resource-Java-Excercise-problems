// Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;
class problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Type First Number");
        int a = sc.nextInt();
        System.out.println("Type Second Number");
        int b = sc.nextInt();
        System.out.println("Type Third Number");
        int c = sc.nextInt();
        int sum = (a+b+c) / 3;
        System.out.print("Your Answer is : ");
        System.out.print(sum);
    }
}
