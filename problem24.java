// Write a Java program to create and display unique three-digit number using 1, 2, 3, 4.
//  Also count how many three-digit numbers are there.



class problem24 {
    public static void main(String[] args) {
        int amount = 0;
        for (int i = 1; i<=5; i++) {
            for (int j = 1; j<=5; j++) {
                for (int k = 1; k<=5; k++) {
                    if (k!=i && k!=j && i!=j) {
                        amount++;
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
        System.out.println("Total Amount is "+amount);
    }
}
