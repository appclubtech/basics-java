class LimitArray {

    public static void main(String[] args) {
        
        String[] chocolates = new String[2];

        chocolates[0] = "Dark Chocolate";
        chocolates[1] = "White Chocolate";
        // chocolates[2] = "Milk Chocolate"; // Array index out of bounds

        System.out.println(chocolates[0] + " & " + chocolates[1] + " are my favorite.");
        // System.out.println(chocolates[2]);

    }
    
}