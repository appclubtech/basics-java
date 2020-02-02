class GreaterLessEqual {

    public static void main(String[] args) {
        
        String[] flavors = { "Chocolate", "Oranage", "Vanilla", "Strawberry" };
        if (flavors.length >= 4) {
            System.out.println("We have enough flavors");
        } else {
            System.out.println("We need more flavors!");
        }

        String toppings[] = { "Sprinkles", "M&M", "Choclate Chip", "Dry Fruits" };
        if (toppings.length > 4) {
            System.out.println("We have enough toppings");
        } else {
            System.out.println("We need more toppings!");
        }
    }
    
}