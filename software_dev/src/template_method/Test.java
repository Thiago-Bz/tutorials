package template_method;

import model.Budget;
import model.Item;

/**
 * Created by bruno on 3/20/17.
 */

public class Test {
    public static void main(String[] args) {
        Budget budget = new Budget(800);

        budget.addItem(new Item("MOUSE PAD", 20));
        budget.addItem(new Item("MONITOR", 200));
        budget.addItem(new Item("SPEAKER", 100));

        DiscountTemplate d1 = new DiscountMoreThan3Items();
        DiscountTemplate d2 = new DiscountValueMoreThan700();

        System.out.println(d1.calculateDiscount(budget));
        System.out.println(d2.calculateDiscount(budget));
    }
}
