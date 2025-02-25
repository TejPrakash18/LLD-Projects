package org.example.BMI;

public class driver {
    public static void main(String[] args) {
        BMICalculate bmiCalculate = new BMICalculate(70.0,1.70,Unit.METRIC);
        System.out.println("BMI value : "+ bmiCalculate.calculateBMI());

        System.out.println("Category :" + bmiCalculate.getBMICategory());
    }
}
