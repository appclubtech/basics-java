class MultipleValues {

    public static void main(String[] args) {
        
        Object[] mixed = { 1, 2.0, true, "string", 'c' };

        for (Object value : mixed) {
            System.out.print(value + " ");
        }

    }
    
}