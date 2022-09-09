// Write a Java program to create a new string taking first three characters from a given string.
// If the length of the given string is less than 3 use "#" as substitute characters.





import java.util.Scanner;
class problem47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type name At least 3 characters");
        String name = sc.nextLine();
        if (name.length() <= 3) {
            System.out.println("###");
        } else {
            System.out.println(name.substring(0, 3));
        }
    }
}
