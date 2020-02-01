class LocalVariables {

    public static void main(String[] args) {
        // hello // Not accessible by the main method!
    }
    
    private static String printHello() {
        String hello = "Hello, Java";
        return hello;
    }

}