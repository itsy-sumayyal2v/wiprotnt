import java.util.Scanner;
public class SameLastDigit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = sc.nextInt();
        if(num1%10 == num2%10){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
        sc.close();
    }
}
