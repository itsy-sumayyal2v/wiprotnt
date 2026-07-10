import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {

        // First StringJoiner
        StringJoiner s1 = new StringJoiner("-");
        s1.add("Delhi");
        s1.add("Mumbai");
        s1.add("Chennai");

        // Second StringJoiner
        StringJoiner s2 = new StringJoiner("-");
        s2.add("Hyderabad");
        s2.add("Bengaluru");
        s2.add("Pune");

        // Case 1: s1 merged to s2
        StringJoiner merge1 = new StringJoiner("-");
        merge1.merge(s2);
        merge1.merge(s1);
        System.out.println("s1 merged to s2 : " + merge1);

        // Case 2: s2 merged to s1
        StringJoiner merge2 = new StringJoiner("-");
        merge2.merge(s1);
        merge2.merge(s2);
        System.out.println("s2 merged to s1 : " + merge2);
    }
}