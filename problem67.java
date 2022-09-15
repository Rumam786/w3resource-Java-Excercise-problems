// Write a Java program to measure how long some code takes to execute in nanoseconds.




class problem67 {
    public static void main(String[] args) {
        long starttime = System.nanoTime();
        for (int i = 1; i <= 1; i++) {
            System.out.println(i);
        }
        long estimatedtime = System.nanoTime() -starttime;
        System.out.println("Estimated time is : "+estimatedtime);
    }
}
