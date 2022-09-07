// Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.




import java.util.Scanner;
class problem29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Type Number");
        int x = sc.nextInt();
        for (int i = 1; i<=100; i++) {
            if (i%x == 0) {
                System.out.println(i+" ");
            }
        }
        System.out.println("Type second Number");
        int z = sc.nextInt();
        for (int j = 1; j<=100; j++) {
            if (j%z == 0) {
                System.out.println(j+" ");
            }
        }
    }
}
