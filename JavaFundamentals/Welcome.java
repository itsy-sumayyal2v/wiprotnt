public class Welcome {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Error: Exactly one command line argument is required.");
            return;
        }

        String name = args[0];
        System.out.println("Welcome " + name );
    }
}