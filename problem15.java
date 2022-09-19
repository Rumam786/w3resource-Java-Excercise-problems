// Write a Java program to swap two variables. 


class problem15 {
    public static void main(String[] args) {
        int x = 15;
        int y = 25;
        System.out.println("Original values");
        System.out.println(x);
        System.out.println(y);
        System.out.println("Values Swapped");
        x = x^y^(y=x);
        System.out.println(x);
        System.out.println(y);
    }
}