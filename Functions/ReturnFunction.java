class ReturnFunction {

    public static void main(String[] args) {

        System.out.println(sayHello() + "Java");
        

    }
    
    private static String sayHello() {

        String hello = "Hello, ";
        return hello; // or return "Hello";

    }
}