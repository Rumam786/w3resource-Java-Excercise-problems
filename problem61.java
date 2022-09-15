// Write a Java program start with an integer n, divide n by 2 if n is even
// or multiply by 3 and add 1 if n is odd, repeat the process until n = 1.




import java.util.Scanner;
class problem61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number");
        int n = sc.nextInt();
        while (n != 1) {
        if (n%2 == 0) {
            n = n/2;
        } else {
            n = (3*n+1)/2;
        }
    }
        System.out.println(n);
        sc.close();
    }
}
