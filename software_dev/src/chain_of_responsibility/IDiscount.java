package chain_of_responsibility;

import model.Budget;

/**
 * Created by bruno on 3/20/17.
 */

public interface IDiscount {
    public double calculateDiscount(Budget budget);
    public void setNext(IDiscount next);
}
