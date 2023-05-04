/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author User
 */
public class Rectangle {

    public double windth;
    public double height;

    public double area() {
        return windth * height;
    }

    public double perimeter() {
        return (windth + height) * 2;
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(windth, 2)+ Math.pow(height, 2));
    }
}
