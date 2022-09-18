// Write a Java program to check if a specified number appears in every 
// pair of adjacent element of a given array of integers.






import java.util.*;
import java.io.*;
class problem69 {
    public static void main(String[] args) {
        int[] array_num = {10,20,10,20,10,20,50};
        int result = 0;
        int x = 20;
        for (int i = 0; i < array_num.length -1; i++) {
            if (array_num[i] != x && array_num[i+1] != x) {
                result = 1;
            }
        }
        if (result == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
