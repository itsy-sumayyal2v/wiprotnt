public class Ascii {
    public static void main(String[] args) {

        // Initialize array with ASCII values
        int[] ascii = {65, 66, 67, 68, 69, 97, 98, 99, 100, 101};

        // Print corresponding characters
        System.out.println("ASCII Values\tCharacters");
        for (int i = 0; i < ascii.length; i++) {
            System.out.println(ascii[i] + "\t\t" + (char) ascii[i]);
        }
    }
}