class AssignBoolean {

    public static void main(String[] args) {
        
        boolean isValid = false;
        String name = "Java";

        System.out.println("Value of isValid: " + isValid);

        if (name.contains("J")) {
            isValid = true;
        }

        System.out.println("Value of isValid: " + isValid);

    }
    
}