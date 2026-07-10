public class Argument {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Error: Exactly two command line arguments are required.");
            return;
        }

        String companyName = args[0];
        String location = args[1];

        System.out.println(companyName + " Technologies " + location);
    }
}