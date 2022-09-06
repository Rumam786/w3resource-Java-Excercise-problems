// Write a Java program that takes a number as input and prints its multiplication table upto 10. 
import java.util.Scanner;
class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type Number");
        int n = sc.nextInt();
        for (int i = 1;i<=10; i++) {
            System.out.println(n*i);
        }
    }
}
