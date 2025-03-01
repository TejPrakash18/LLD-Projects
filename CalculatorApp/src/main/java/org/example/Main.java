package org.example;


import org.example.factory.CalculatorFactory;
import org.example.simplecals.Airthmatic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // object creation via factory pattern
        while (true) {
            try {
                System.out.println("\nCLI Calculator");
                System.out.println("Available Operation : add (+), subtract (-), multiply (*), divide (/), module (%)");
                System.out.println("Enter `exit` to quit");

                System.out.println("enter first number");
                String input1 = scanner.next();
                if (input1.equalsIgnoreCase("exit")) break;
                double num1 = Double.parseDouble(input1);

                System.out.println("Enter the operation");
                String operation = scanner.next();
                if (operation.equalsIgnoreCase("exit")) break;


                System.out.println("Enter second number");
                String input2 = scanner.next();
                if (input2.equalsIgnoreCase("exit")) break;
                double num2 = Double.parseDouble(input2);
                Airthmatic op = CalculatorFactory.getOperation(operation);
                double result = op.calculation(num1, num2);

                System.out.println("Result: " + result);

            } catch (Exception e) {
                System.out.println("Error" + e.getMessage());
            }
        }
        System.out.println("Calculator exited");
        scanner.close();
    }

}





        //Arithmetic
//        Airthmatic addition = new Addition();
//        Airthmatic subtraction = new Subtraction();
//        Airthmatic multiplication = new Multiplication();
//        Airthmatic divide = new Divide();
//        Airthmatic module = new Modul();
//        //input -> A, B
//
//        System.out.println(addition.calculation(4.0, 5.0));
//        System.out.println(subtraction.calculation(3.1, 2.1));

        //BMI
//        BMICalculate bmiCalculate = new BMICalculate(70.0, 175.0, Unit.IMPERIAL);
//        System.out.println(bmiCalculate.calculateBMI());
//        System.out.println(bmiCalculate.getBMICategory());



        // Trigonometri
//        trigonometriOperation obj = new TanTheta();
//        double tanResult = obj.calculate(6.8, 5.4);
//        System.out.println(tanResult);
//
//        trigonometriOperation obj1 = new SinTheta();
//        double sinResult = obj.calculate(6.8, 5.4);
//        System.out.println(sinResult);
//
//        trigonometriOperation obj2 = new CosTheta();
//        double CosResult = obj.calculate(6.8, 5.4);
//        System.out.println(CosResult);

//    }
//  }