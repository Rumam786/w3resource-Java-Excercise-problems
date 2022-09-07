// Write a Java program that accepts three integers from the user and return true if the second number is greater
//  than first number and third number is greater than second number.



import java.util.Scanner;
class problem32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Type First Number");
        int x = sc.nextInt();
        System.out.println("Type Second Number");
        int y = sc.nextInt();
        System.out.println("Type Third Number");
        int z = sc.nextInt();
        System.out.println(test(x, y, z,true));
    }
    public static boolean test(int a, int b, int c, boolean xyz) {
        if (xyz)
        return (c>b);
        return (b>a && c>b);
    }
}
