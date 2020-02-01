class StaticVariable {

    static String hello;

    public static void main(String[] args) {

        hello = "Hello, Java from the main method";
        System.out.println(hello);
        System.out.println(printHello());

    }
    
    private static String printHello() {
        hello = "Hello, Java from printHello function";
        return hello;
    }
    
}