/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio1;

import entities.Rectangle;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Rectangle rec = new Rectangle();

        System.out.println("Enter rectagle width and height: ");
        rec.windth = sc.nextDouble();
        rec.height = sc.nextDouble();
        
        System.out.print("Area = "+rec.area());
        System.out.print("\nPerimeter = "+rec.perimeter());
        System.out.print("\nDiagonal\n = "+rec.diagonal());
    }

}
