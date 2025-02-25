package org.example.BMI;

public class BMICategory {
    public static String getCategory(double bmi){
        if (bmi < 15 ) return "Underweight";
        else if (bmi >= 15 && bmi <30)  return "Fit do nothing..!";
        else return "Over weight goto gym";
    }
}
