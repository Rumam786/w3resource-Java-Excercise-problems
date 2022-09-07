// Write a Java program to input and display your password. Go to the editor
// Expected Output

// Input your Password:                                                    
// Your password was: abc@123

import java.util.Scanner;
class problem19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type Password");
        String pass = sc.nextLine();
        System.out.println("Your Password is ");
        System.out.println(pass);
    }
}