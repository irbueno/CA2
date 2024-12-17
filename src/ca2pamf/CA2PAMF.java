package ca2pamf;
//@author IBueno
//GitHub repository: https://github.com/irbueno/CA2
//Notes: I was having issues with github when creating the repository, apparently all is sorted
//Notes: Not 100% sure if I was able to display the first repeated item all times for Task 1.
//Notes: Same with Task 4 and 5, hopefully everything is printing correctly, hopefully.

//Adding scanner for data input
import java.util.Scanner;

public class CA2PAMF
{
    public static void main(String[] args)
    {
        //Adding scanner for data input
        Scanner scan = new Scanner(System.in);
        // Task 1: Array Search – Finding First Repeated Element
        ArraySearch(scan);
        // Task 2 Multiplication Table - Matrix Using 2D Array
        MultiTable(scan);
        // Task 3: Diagonal Sum - Square Matrix Diagonal Sum
        DiagSum(scan);
        // Task 4: Traversal Spiral - Matrix Spiral Traversal
        TravSpiral(scan);
        //Task 5: Bubble Sort - Array Sorting
        BubSort(scan);
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

    // Task 4: Traversal Spiral - Matrix Spiral Traversal
    public static void TravSpiral (Scanner scan)
    {
        System.out.println("=== Task 4: Traversal Spiral ===");
        // Taking array size
        System.out.print("Enter row size: ");
        int rsize = scan.nextInt();
        System.out.print("Enter column size: ");
        int csize = scan.nextInt();
        // Checking positive value
        while (rsize <= 0 || csize <= 0)
        {
            System.out.println("Both sizes must be greater than 0.");
            System.out.print("Enter row size: ");
            rsize = scan.nextInt();
            System.out.print("Enter column size: ");
            csize = scan.nextInt();
        }
        // Creating array
        int[][] array = new int[rsize][csize];
        // Taking array elements
        System.out.print("Enter array elements: ");
        for (int i = 0; i < rsize; i++)
        {
            for (int j = 0; j < csize; j++)
            {
                array[i][j] = scan.nextInt();
            }
        }
        // Calculating & printing spiral traversal
        int top = 0;
        int bot = rsize - 1;
        int left = 0;
        int right = csize - 1;
        System.out.print("Spiral Traversal: ");
        while (top <= bot && left <= right)
        {
            // Traversing from Left to Right
            for (int i = left; i <= right; i++)
            {
                System.out.print(array[top][i] + " ");
            }
            top++;
            // Traversing from Top to Bot
            for (int i = top; i <= bot; i++)
            {
                System.out.print(array[i][right] + " ");
            }
            right--;
            // Traversing from Right to Left
            if (top <= bot)
            {
                for (int i = right; i >= left; i--)
                {
                    System.out.print(array[bot][i] + " ");
                }
                bot--;
            }
            // Traversing from Bot to Top
            if (left <= right)
            {
                for (int i = bot; i >= top; i--)
                {
                    System.out.print(array[i][left] + " ");
                }
                left++;
            }
        }
    }

    //Task 5: Bubble Sort - Array Sorting
    public static void BubSort (Scanner scan)
    {
        System.out.println("\n=== Task 5: Bubble Sort ===");
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
        // Printing array before sorting
        System.out.print("Array before sorting: ");
        for(int i = 0; i < size; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        // Bubble sorting & swaping +counter
        int asize = array.length;
        boolean swap; // Setting first pass
        int counter = 0;
        for (int i = 0; i < asize - 1; i++)
        {
            swap = false; // Awaiting possible swap
            for (int j = 0; j < asize - i - 1; j++)
            {
                // Changing to > for ascending sorting
                if (array[j] > array[j + 1])
                {
                    // Swapping elements +counter up
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    counter++;
                    swap = true; // Showing swap occured
                }
            }
            // Checking if no swaps / Sorting break
            if (!swap)
            {
                break;
            }
        }
        // Printing array after sorting
        System.out.print("Array before sorting: ");
        for(int i = 0; i < size; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println(); 
        // Printing total swaps
        System.out.println("Total number of swaps: " + counter);
    }
}