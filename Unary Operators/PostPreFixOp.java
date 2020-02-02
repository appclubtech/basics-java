class PostPreFixOp {

    public static void main(String[] args) {
        
        int a = 10, b = 10;

        System.out.println("\n------ Before ------");
        System.out.println("Value of a before: " + a);
        System.out.println("Value of b before: " + b);

        int prefix = ++a; // prefix increment operator
        int postfix = b++; // postfix increment operator

        System.out.println("\n------ After ------");

        System.out.println("prefix value: " + prefix);
        System.out.println("Value of a now: " + a);

        System.out.println("postfix value: " + postfix);
        System.out.println("Value of b now: " + b);


        

    }
    
}