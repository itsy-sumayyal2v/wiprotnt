public class MyClassWithLambda {

    public static void main(String[] args) {

        WordCount wc = (str) -> {
            return str.split(" ").length;
        };

        String text = "Java Lambda Expression Example";

        System.out.println("Number of words: " + wc.count(text));
    }
}