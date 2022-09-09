// Write a Java program to create a string in the form short_string + long_string + short_string from two strings.
// The strings must not have the same length.



import java.util.Scanner;
class problem45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type First Word");
        String name = sc.nextLine();
        System.out.println("Type Second Word");
        String name2 = sc.nextLine();
        if (name.length() >= name2.length()) {
            System.out.println(name+" "+name2+" "+name);
        } else if (name.length() <= name2.length()) {
            System.out.println(name2+" "+name+" "+name2);
        }
    }
}
