import java.util.Scanner;
public class ChangeCase{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if(ch>='a' && ch <= 'z'){
            System.out.println("Uppercase: " + Character.toUpperCase(ch));
        } else if(ch>='A' && ch<='Z'){
            System.out.println("Lowercase: " + Character.toLowerCase(ch));
        }
    }
}