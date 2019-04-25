package at.amin.calculator.controller.operation;

import at.amin.calculator.model.Expression;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Subtraction implements Operation {
    @Override
    public boolean matches(Expression expression) {
        return Objects.equals("-", expression.getSymbol());
    }

    @Override
    public double apply(Expression expression) {
        return expression.getNumber1() - expression.getNumber2();
    }
}