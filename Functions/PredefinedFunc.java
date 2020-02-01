class PredefinedFunc {

    public static void main(String[] args) {
        System.out.println("Using Pre-Defined Function: " + Math.addExact(2, 3));
        System.out.println("Using User-Defined Function: " + add(2, 2));

    }
    
    static int add(int valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }
    
}