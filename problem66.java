// Write a Java program to get the value of the environment variable PATH, TEMP, USERNAME.



class problem66 {
    public static void main(String[] args) {
        System.out.println("Environment variable path");
        System.out.println(System.getenv("PATH"));
        System.out.println("Environment variable temp");
        System.out.println(System.getenv("TEMP"));
        System.out.println("Environment variable username");
        System.out.println(System.getenv("USERNAME"));
    }
}
