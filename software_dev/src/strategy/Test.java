package strategy;

import model.Budget;

/**
 * Created by bruno on 3/20/17.
 */

public class Test {
    public static void main(String[] args) {
        Budget budget = new Budget(5000);
        ITax simpleTax = new SimpleTax();
        ITax complexTax = new ComplexTax();

        System.out.println("Simple tax: " + simpleTax.calculate(budget));
        System.out.println("Complex tax: " + complexTax.calculate(budget));
    }
}