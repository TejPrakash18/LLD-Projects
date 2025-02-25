package org.example.simplecals;

public class Driver {
    public static void main(String[] args) {
        Airthmatic add = new Addition();
        Airthmatic sub = new Subtraction();
        Airthmatic mul = new Multiplication();
        Airthmatic div = new Divide();
        Airthmatic mod = new Modul();
        double result  = div.calculation(1,0);
        System.out.println(result);



    }
}
