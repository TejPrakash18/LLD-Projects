package org.example.BMI;

public class BMICalculate {
    private double weight;
    private double height;
    private Unit unit;

    public BMICalculate(double weight, double height, Unit unit) {
        this.weight = weight;
        this.height = height;
        this.unit = unit;
    }

     public double calculateBMI(){
        return weight /(height*height);
     }
     public String getBMICategory(){
        return BMICategory.getCategory(calculateBMI());
     }
}