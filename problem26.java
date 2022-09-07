// Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.




import java.util.Scanner;
class problem26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Type Number");
        int n = sc.nextInt();
        System.out.printf("%d + %d%d + %d%d%d\n",n,n,n,n,n,n);
    }
}