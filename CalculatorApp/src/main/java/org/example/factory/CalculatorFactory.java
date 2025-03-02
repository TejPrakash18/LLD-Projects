package org.example.factory;

import org.example.simplecals.*;
import org.example.trigonometri.*;

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
    public static trigonometriOperation getOpeeration2(String operation){
            return switch (operation){
                case "sinTheta" ,"sin0" -> new SinTheta();
                case "tentheta" ,"tan0" -> new TanTheta();
                default -> throw new IllegalArgumentException("Invalid operation" + operation);
            };
    }

}



// case "Add":
//return operation
// break;