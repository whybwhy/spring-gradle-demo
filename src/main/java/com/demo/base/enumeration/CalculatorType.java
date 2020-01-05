package com.demo.base.enumeration;

import java.util.function.Function;

public enum CalculatorType {

    CALC_A(1, value -> value),
    CALC_B(2, value -> value * 2),
    CALC_C(3, value -> value * 3);

    private Function<Long, Long> expression;
    private int type;

    CalculatorType(int type, Function<Long, Long> expression) {
        this.expression = expression;
        this.type = type;
    }

    public long calculate(long value) { return expression.apply(value); }

}
