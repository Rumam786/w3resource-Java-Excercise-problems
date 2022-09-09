// Write a Java program to create the concatenation of the two strings except removing the first character of each string.
// The length of the strings must be 1 and above. Go to the editor
// Test Data: Str1 = Python
// Str2 = Tutorial
// Sample Output:

// ythonutorial



import java.util.Scanner;
class problem46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Type First Word");
        String name = sc.nextLine();
        System.out.println("Type Second Word");
        String name2 = sc.nextLine();
        System.out.println(name.substring(1)+name2.substring(1));
    }
}
