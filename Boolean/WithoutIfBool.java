class WithoutIfBool {

    public static void main(String[] args) {
        
        boolean isValid = false;
        String name = "Java";

        System.out.println("Value of isValid: " + isValid);

        isValid = name.contains("J");

        System.out.println("Value of isValid: " + isValid);

    }

}