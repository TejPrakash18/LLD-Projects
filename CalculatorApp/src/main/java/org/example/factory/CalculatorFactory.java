package org.example.factory;

import org.example.simplecals.*;

public class CalculatorFactory {

        public static Airthmatic getOperation(String operation) {
            return switch (operation) {
                case "add", "+" -> new Addition();
                case "subtract", "-" -> new Subtraction();
                case "multiply", "*" -> new Multiplication();
                case "divide", "/" -> new Divide();
                case "module", "%" -> new Modul();
                default -> throw new IllegalArgumentException("Invalid operation" + operation);
            };
    }

}
