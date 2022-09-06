// Write a Java program to print the area and perimeter of a rectangle.
// Test Data:
// Width = 5.6 Height = 8.5

// Expected Output
// Area is 5.6 * 8.5 = 47.60
// Perimeter is 2 * (5.6 + 8.5) = 28.20



class problem12 {
    public static void main(String[] args) {
        double Width = 5.6;
        double Height = 8.5;
        double perimeter = 2 * (Width + Height);
        double area = Width * Height;
        System.out.println(area);
        System.out.println(perimeter);
    }
}
