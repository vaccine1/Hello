/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author mohammadsarhan
 */
public class JavaApplication4{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JavaApplication4 js = new JavaApplication4();
        js.swap();
}  
    public void swap () {
        int a,b,c;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("a is "+a);
        System.out.println("b is "+b);
    }
}