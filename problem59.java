// Write a Java program to take the last three characters from a given string and add the three characters
//  at both the front and back of the string. String length must be greater than three and more.
// Test data: "Python" will be "honPythonhon"




import java.util.*;
class problem59 {
    public static void main(String[] args) {
        String name = "Python";
        int slength = 3;
        if (slength > name.length()) {
            slength = name.length();
        }
        String subpart = name.substring(name.length()-3);
        System.out.println(subpart+name+subpart);
    }
}
