class ErrorUserDef {

    public static void main(String[] args) {

        System.out.println(add(Integer.MAX_VALUE, 2));
        System.out.println(Integer.MAX_VALUE);

    }
    
    static int add(int valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }
    
}