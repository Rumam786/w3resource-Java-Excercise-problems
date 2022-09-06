// Write a Java program to print the area and perimeter of a circle. Go to the editor
// Test Data:
// Radius = 7.5
// Expected Output
// Perimeter is = 47.12388980384689
// Area is = 176.71458676442586


class problem10 {
    public static void main(String[] args) {
        double radius = 7.5;
        double perimeter = 2*Math.PI*radius;
        double area = Math.PI*radius*radius;
        System.out.println("Your Answer is "+perimeter);
        System.out.println("Your Answer is "+area);
    }
}
