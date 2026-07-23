import java.util.*;

class Card {
    private String symbol;
    private int number;

    public Card(String symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getNumber() {
        return number;
    }
}

public class Cards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Cards :");
        int n = sc.nextInt();

        TreeMap<String, ArrayList<Card>> map = new TreeMap<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter card " + i + ":");
            String symbol = sc.next();
            int number = sc.nextInt();

            Card card = new Card(symbol, number);

            if (!map.containsKey(symbol)) {
                map.put(symbol, new ArrayList<Card>());
            }
            map.get(symbol).add(card);
        }

        System.out.println("Distinct Symbols are :");
        for (String key : map.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();

        for (String key : map.keySet()) {
            System.out.println("Cards in " + key + " Symbol");

            int sum = 0;
            ArrayList<Card> list = map.get(key);

            for (Card c : list) {
                System.out.println(c.getSymbol() + " " + c.getNumber());
                sum += c.getNumber();
            }

            System.out.println("Number of cards : " + list.size());
            System.out.println("Sum of Numbers : " + sum);
        }

        sc.close();
    }
}