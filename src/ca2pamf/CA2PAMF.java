/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca2pamf;

//Adding scanner for data input
import java.util.Scanner;

public class CA2PAMF {
    public static void main(String[] args) {
        //Adding scanner for data input
        Scanner scan = new Scanner(System.in);
        // Task 1: Array Search – Finding First Repeated Element
        ArraySearch(scan);
        // Task 2 Multiplication Table - Matrix Using 2D Array
        MultiTable(scan);
        // Task 3: Diagonal Sum - Square Matrix Diagonal Sum
        DiagSum(scan);
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
        // Taking array elements
        System.out.print("Enter array elements: ");
        for (int i = 0; i < size; i++)
        {
            array[i] = scan.nextInt();
        }
        // Finding first repeated element
        int rep = -6; // "No-repetition" marker for printing
        for (int i = 0; i < size; i++)
        {
            for (int j = i + 1; j < size; j++)
            {
                if (array[i] == array[j])
                {
                    rep = array[i];
                    break;
                }
            }
        }
        // Printing proper repeated element result
        if (rep != -6)
        {
            System.out.println("First repeated element: " + rep);
        } else
        {
            System.out.println("No repeated elements found.");
        }
    }

    // Task 2 Multiplication Table - Matrix Using 2D Array
    public static void MultiTable (Scanner scan)
    {
        System.out.println("=== Task 2: Multiplication Table ===");
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
        int[][] array = new int[size][size];
        // Populating array
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
        // Printing multiplication table matrix
        System.out.println("Multiplication Table Matrix:");
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Task 3: Diagonal Sum - Square Matrix Diagonal Sum
    public static void DiagSum (Scanner scan)
    {
        System.out.println("=== Task 3: Diagonal Sum ===");
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
        int[][] array = new int[size][size];
        // Taking array elements
        System.out.print("Enter array elements: ");
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                array[i][j] = scan.nextInt();
            }
        }
        // Calculating diagonals sum
        int diag1 = 0;
        int diag2 = 0;
        for (int i = 0; i < size; i++)
        {
            diag1 += array[i][i]; 
            diag2 += array[i][size - 1 - i];
        }
        // Printing sum of both diagonals
        System.out.println("Sum of diagonal#1: " +diag1);
        System.out.println("Sum of diagonal#2: " +diag2);
    }

}
