package com.example.triangle;

import javax.swing.*;

public class Triangle {
    public static void main(String[] args){
        double Width = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter The Width Of Triangle"));
        double Length = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter The Length Of Triangle"));
        double Height= Double.parseDouble(JOptionPane.showInputDialog(null,"Enter The Height Of Triangle"));
        double area = Area(Width,Length,Height);
        double Perimeter = perimeter(Width,Length,Height);
        JOptionPane.showMessageDialog
                (null,"The Area is :"+area +" AND the Perimeter is :" +Perimeter);


    }
    private static double Area(double x,double y,double z){
        return  (x*y)*z;
    }
    private static double  perimeter(double a,double b,double c){
        return (a+b)+c;
    }
}
