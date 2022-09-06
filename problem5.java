// Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
import java.util.Scanner;
// Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
import javax.xml.transform.Source;
class problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type First Number");
        int a = sc.nextInt();
        System.out.println("Type Second Number");
        int b = sc.nextInt();
        Scanner op = new Scanner(System.in);
        System.out.println("Choose an operation : +, -, *, /, %");
        String operation = sc.next();
        if (operation.equals ("+")) {
            System.out.println("Your  Answer is "+(a+b));
        } else if (operation.equals ("-")) {
            System.out.println("Your  Answer is "+(a-b));
        } else if (operation.equals ("*")) {
            System.out.println("Your  Answer is "+(a*b));
        } else if (operation.equals ("/")) {
            System.out.println("Your  Answer is "+(a/b));
        } else if (operation.equals ("%")) {
            System.out.println("Your  Answer is "+(a%b));
        } else {
            System.out.println("Invaild Operation");
        }
    }     
}
