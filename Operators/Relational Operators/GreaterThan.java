class GreaterThan {

    public static void main(String[] args) {

        String[] flavors = { "Chocolate", "Oranage", "Vanilla", "Strawberry" };
        
        if (flavors.length > 2) {
            System.out.println("We have enough flavors for desserts.");
        } else {
            System.out.println("We need more flavors!");
        }
        
    }
}