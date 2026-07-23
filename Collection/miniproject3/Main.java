import java.util.*;

// Card class
class Card {
    private char symbol;
    private int number;

    public Card(char symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getNumber() {
        return number;
    }

    // Two cards are equal if both symbol and number are same
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Card))
            return false;

        Card c = (Card) obj;
        return symbol == c.symbol && number == c.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, number);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Card> set = new HashSet<>();
        TreeMap<Character, Card> map = new TreeMap<>();

        int count = 0;

        while (map.size() < 4) {
            System.out.println("Enter a card :");
            char symbol = sc.next().charAt(0);
            int number = sc.nextInt();

            Card card = new Card(symbol, number);
            set.add(card);
            count++;

            // Store only first occurrence of each symbol
            if (!map.containsKey(symbol)) {
                map.put(symbol, card);
            }
        }

        System.out.println("Four symbols gathered in " + count + " cards.");
        System.out.println("Cards in Set are :");

        for (Map.Entry<Character, Card> entry : map.entrySet()) {
            Card c = entry.getValue();
            System.out.println(c.getSymbol() + " " + c.getNumber());
        }

        sc.close();
    }
}