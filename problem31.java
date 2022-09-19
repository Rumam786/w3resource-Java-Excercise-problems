// Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.




import java.util.Scanner;
class problem31 {
    public static boolean calculatesum(int x,int y, int z) {
        return ((x+y) == z || (y+z) == x || (x+z) == y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Type First Number");
        int a = sc.nextInt();
        System.out.println("Type Second Number");
        int b = sc.nextInt();
        System.out.println("Type Third Number");
        int c = sc.nextInt();
        System.out.println(calculatesum(a, b, c));
    }
}
