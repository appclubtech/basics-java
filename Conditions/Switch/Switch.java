class Switch {

    public static void main(String[] args) {

        char character = 'a';

        switch (character) {
        case 'a':
            System.out.println("You selected 'a'");
            break;
        case 'A':
            System.out.println("You selected 'A'");
            break;
        default:
            System.out.println("Nothing selected!");
            break;
        }
        
    }
}