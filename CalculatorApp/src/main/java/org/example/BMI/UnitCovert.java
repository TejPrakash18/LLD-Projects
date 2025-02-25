package org.example.BMI;

public class UnitCovert {
    public static double covertWeight(double weight, Unit unit){
         return  (unit == Unit.IMPERIAL) ? weight * 0.456 : weight;
    }
    public static  double covertHeight(double height , Unit unit){
        return (unit == Unit.IMPERIAL) ? height * 0.03 : height;
    }
}
