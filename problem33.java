// Write a Java program to convert seconds to hour, minute and seconds.
// Sample Output:

// Input seconds: 86399                                                   
// 23:59:59



import java.util.Scanner;
class problem33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type Seconds");
        int seconds = sc.nextInt();
        int S = seconds%60;
        int H = seconds/60;
        int M = H%60;
        H = H/60;
        System.out.println(H+":"+M+":"+S);
    }
}