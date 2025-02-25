package org.example;

import org.example.BMI.BMICalculate;
import org.example.BMI.Unit;
import org.example.simplecals.*;
import org.example.trigonometri.CosTheta;
import org.example.trigonometri.SinTheta;
import org.example.trigonometri.TanTheta;
import org.example.trigonometri.trigonometriOperation;

public class Main {
    public static void main(String[] args) {
        //Arithmetic
        Airthmatic addition = new Addition();
        Airthmatic subtraction = new Subtraction();
        Airthmatic multiplication = new Multiplication();
        Airthmatic divide = new Divide();
        Airthmatic module = new Modul();

        System.out.println(addition.calculation(2.3, 3.2));
        System.out.println(subtraction.calculation(3.1, 2.1));

        //BMI
        BMICalculate bmiCalculate = new BMICalculate(70.0, 1.70, Unit.IMPERIAL);
        System.out.println(bmiCalculate.calculateBMI());
        System.out.println(bmiCalculate.getBMICategory());



        // Trigonometri
        trigonometriOperation obj = new TanTheta();
        double tanResult = obj.calculate(6.8, 5.4);
        System.out.println(tanResult);

        trigonometriOperation obj1 = new SinTheta();
        double sinResult = obj.calculate(6.8, 5.4);
        System.out.println(sinResult);

        trigonometriOperation obj2 = new CosTheta();
        double CosResult = obj.calculate(6.8, 5.4);
        System.out.println(CosResult);

    }
}