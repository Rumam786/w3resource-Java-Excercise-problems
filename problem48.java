// Write a Java program to create a new string taking first and last characters from two given strings. 
// If the length of either string is 0 use "#" for missing character.
// Test Data: str1 = "Python"
// str2 = " "
// Sample Output:

// P#




import java.util.Scanner;
class problem48 {
    public static void main(String[] args) {
        String name = "Python ";
        String name2 = " ";
        if (name.length() != 0) {
            System.out.print(name.substring(0,1));
        } if (name2.length() == 1) {
            System.out.print("#");
        }
    }
}
