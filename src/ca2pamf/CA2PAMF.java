/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca2pamf;

//Adding scanner for data input
import java.util.Scanner;

public class CA2PAMF {
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
        // Task 1: Array Search – Finding First Repeated Element   
    public static void ArraySearch (Scanner scan)
    {
        System.out.println("=== Task 1: Array Search ===");
        // Taking array size
        System.out.print("Enter array size: ");
        int size = scan.nextInt();
        // Checking positive value
        while (size <= 0)
        {
            System.out.println("Array size must be greater than 0.");
            System.out.print("Enter array size: ");
            size = scan.nextInt();
        }
        // Creating array
        int[] array = new int[size];
    }
    
}
