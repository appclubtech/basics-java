class NotEqual {

    public static void main(String[] args) {
        
        String[] flavors = { "Chocolate", "Oranage", "Vanilla", "Strawberry" };

        if (flavors.length != 5) {
            System.out.println("We need atleast 5 flavors.");
        } else {
            System.out.println("We have enough flavors.");
        }

    }
    
}