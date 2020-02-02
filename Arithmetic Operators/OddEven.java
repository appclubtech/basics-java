class OddEven {

    public static void main(String[] args) {
        
        int limit = 10;

        for (int i = 1; i <= limit; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
            
        }

    }
    
}