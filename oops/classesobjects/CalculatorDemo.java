class Calculator {

    // Static method for integer power
    static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    // Static method for double power
    static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {

        int result1 = Calculator.powerInt(2, 5);
        double result2 = Calculator.powerDouble(2.5, 3);

        System.out.println("powerInt(2,5) = " + result1);
        System.out.println("powerDouble(2.5,3) = " + result2);
    }
}