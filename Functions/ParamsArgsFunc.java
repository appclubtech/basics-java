class ParamsArgsFunc {

    public static void main(String[] args) {

        // Calling function directly
        System.out.println("1 + 2 = " + add(1, 2));

        // Storing the value of the function returned
        int value = add(5, 5);
        System.out.println("5 + 5 = " + value);

    }
    
    static int add(int valueOne, int valueTwo) {

        return valueOne + valueTwo;
        
    }
    
}