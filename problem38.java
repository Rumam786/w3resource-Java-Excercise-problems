// Write a Java program that accepts two integer values from the user and return the larger values. However if the two values are the same, return 0 and
//  return the smaller value if the two values have the same remainder when divided by 6.



import java.util.*;
import javax.xml.stream.events.StartDocument;
class problem38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type First Number");
        int a = sc.nextInt();
        System.out.println("Type Second Number");
        int b = sc.nextInt();
        System.out.println("Result : "+test(a,b));
    }
    public static int test(int x, int y) {
        if (x == y)
        return 0;
        if (x%6 == y%6)
        return (x<y ? x : y);
        return (x>y ? x : y);
    }
}
