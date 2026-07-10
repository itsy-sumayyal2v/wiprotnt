import java.util.Optional;

public class OptionalDemo1 {
    public static void main(String[] args) {

        String[] names = new String[5];

        Optional<String> optional = Optional.ofNullable(names[0]);

        System.out.println("Length: " + optional.map(String::length).orElse(0));
    }
}