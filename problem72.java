// Write a Java program that accepts four integer from the user and 
// prints equal if all four are equal, and not equal otherwise.



import java.util.Scanner;
class problem72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type First Number");
        int a = sc.nextInt();
        System.out.println("Type Second Number");
        int b = sc.nextInt();
        System.out.println("Type Third Number");
        int c = sc.nextInt();
        System.out.println("Type Fourth Number");
        int d = sc.nextInt();
        if (a == b && a == c && a == d && b == c && b == d && c == d) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
