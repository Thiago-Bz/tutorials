package chain_of_responsibility;

import model.Budget;
import model.Item;

/**
 * Created by bruno on 3/20/17.
 */

public class Test {
    public static void main(String[] args) {
        Budget budget = new Budget(50);

        budget.addItem(new Item("KEYBOARD", 10));
        budget.addItem(new Item("MOUSE PAD", 20));
        budget.addItem(new Item("MONITOR", 200));
        budget.addItem(new Item("SPEAKER", 100));

        CalculateDiscount calc = new CalculateDiscount();

        System.out.println(calc.getDiscount(budget));
    }
}