import java.io.*;
import java.util.*;

public class Matrix
{
    public static void main(String args[])
    {
        int row1, col1, row2, col2;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of row of 1st matrix: ");
        row1 = s.nextInt();
        System.out.print("Enter the size of column of 1st matrix");
        col1 = s.nextInt();
        System.out.print("\nEnter the size of row of 2nd matrix: ");
        row2 = s.nextInt();
        System.out.println("Enter the size of column of 2nd matrix: ");
        col2 = s.nextInt();
        
        int matrix1[][];
        matrix1 = new int[row1][col1];
        
        int matrix2[][];
        matrix2 = new int[row2][col2];
        
        System.out.println("Enter the elements of the first matrix.");
        for(int i = 0; i<row1; i++)
        {
            for(int j = 0; j<col1; j++)
            {
                matrix1[i][j] = s.nextInt();
            }
        }
        
        System.out.println("Enter the elements of the second matrix.");
        
        for(int i = 0; i<row2; i++)
        {
            for(int j = 0; j<col2; j++){
                matrix2[i][j] = s.nextInt();
            }
        }
        
        int sum[][];
        sum = new int[row1][col1];
        if(row1 == row2 && col1 == col2)
        {
            for(int i =0; i<row1; i++)
            {
                for(int j = 0; j<col1; j++){
                    sum[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            
            System.out.println("The sum of the matrix is printed below.");
            
            for(int i = 0; i<row1; i++)
            {
                for(int j = 0; j<col1; j++)
                {
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("The matrix cannot be added, since there don't have equal number of rows and columns");
        }
        
        int multiplication[][];
        multiplication = new int[row1][col2];
        if(col1 == row2)
        {
            for(int i = 0; i<row1; i++)
            {
                for(int j = 0; j<col2; j++)
                {
                    for(int k = 0; k<col1; k++){
                        multiplication[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            System.out.println("The matrix multiplication is given below.");
            
            for(int i = 0; i<row1; i++)
            {
                for(int j = 0; j<col2; j++)
                {
                    System.out.print(multiplication[i][j] + " ");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("The given matrixes can't be multiplied because the column size of 1st matrix is not equal to the row size of 2nd matrix.");   
        }
    }
    
}
