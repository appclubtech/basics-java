class InstanceVariable {

    String hello;

    public static void main(String[] args) {

        InstanceVariable iVariables = new InstanceVariable();
        iVariables.hello = "Hello, Java from main method.";
        System.out.println(iVariables.hello);
        System.out.println(printHello());

    }
    
    private static String printHello() {
        InstanceVariable iVariables = new InstanceVariable();
        iVariables.hello = "Hello, Java from the printHello function.";
        return iVariables.hello;
    }
    
}