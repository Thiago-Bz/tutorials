package strategy;

/**
 * Created by bruno on 3/20/17.
 */

public class Test {
    public static void main(String[] args) {
        Budget budget = new Budget(5000);
        ITax simpleTax = new SimpleTax();
        ITax complexTax = new ComplexTax();

        System.out.println(complexTax.calculate(budget));
    }
}