package strategy;

import model.Budget;

public interface ITax {
    public double calculate(Budget budget);
}