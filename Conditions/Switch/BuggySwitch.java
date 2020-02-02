class BuggySwitch {

    public static void main(String[] args) {

        char character = 'a';

        switch (character) {
        case 'a':
            System.out.println("You selected 'a'");
        case 'A':
            System.out.println("You selected 'A'");
            break;
        default:
            System.out.println("Nothing selected!");
            break;
        }
        
    }
}