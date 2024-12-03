/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author FPT
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Nhap tuoi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("nhap ten: ");
        String name = scanner.nextLine();
        scanner.close();
        
    }
    
}
