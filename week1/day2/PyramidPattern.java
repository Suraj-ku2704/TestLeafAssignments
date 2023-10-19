package week1.day2;

import java.util.Scanner;

public class PyramidPattern
{
    public static void main(String arg[])
    {
        System.out.print("Enter number of rows:");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        //Outer loop work for rows
        for (int i = 1; i <= rows; i++)
        {
            //inner loop creating space
            for (int j = rows-i; j >= 1; j--)
            {
                //prints space between two stars
                System.out.print(" ");
            }
            //inner loop for columns
            for (int j = 1; j <= i; j++ )
            {
                //prints star
                System.out.print("* ");
            }
            //Moving the cursor in a new line after printing each line
            System.out.println();
        }
    }
}
