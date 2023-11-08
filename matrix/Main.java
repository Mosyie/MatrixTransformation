//* Main class for running the actual algorithms */
import data.CreateMatrix;
import data.ReadData;
import data.inputException;

public class Main{
    public static void main(String [] args)
    {
        System.out.println
            (
            "\n/**********/\nHOW TO USE:\n" + "FIRST LINE: LENGHT OF MATRIX (N x N)\n" + "LINES FOR MATRIX (N x N)\n" + "LAST LINE TYPE OF MATRIX TRANSFORMATION\n/*********/\n\n"
            ); 
        
        //stores the whole read data of input
        ReadData data = ReadData.dataInput();
        //stores the matrix of numbers
        double numberMatrix[][] = null; // Can not by null when processing due to Exception handling
        try
        {
            numberMatrix = CreateMatrix.makeMatrix(data.getMatrix());
            for(int i = 0; i < numberMatrix.length; i++)
            {
                for(int j = 0; j < numberMatrix[i].length; j++)
                {
                        System.out.print(numberMatrix[i][j]);
                }
                System.out.println();
            }
        }
        catch(inputException e)
        {
           System.err.println("Need to input an NxN matrix!");
        }
    }
}