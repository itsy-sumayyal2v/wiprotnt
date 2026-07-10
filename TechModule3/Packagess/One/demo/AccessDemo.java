package demo;
import test.Foundation;
public class AccessDemo {
    public static void main(String[] args) {
        Foundation foundation = new Foundation();
        
        // Accessing variables with different access modifiers
        //System.out.println(foundation.var1); // Not accessible
        //System.out.println(foundation.var2); // Accessible within the same package
       // System.out.println(foundation.var3); // Accessible within the same package and subclasses
        System.out.println("Public Variable: " + foundation.var4); // Accessible from anywhere
    }
}
