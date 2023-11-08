
//* Main class for running the actual algorithms */
import data.CreateMatrix;
import data.ReadData;

public class Main{
    public static void main(String [] args)
    {
        System.out.println(
            "\n/**********/\nHOW TO USE:\n" + "FIRST LINE: LENGHT OF MATRIX (N x N)\n" + "LINES FOR MATRIX (N x N)\n" + "LAST LINE TYPE OF MATRIX TRANSFORMATION\n/*********/\n\n"); 
        
        //stores the whole read data of input
        ReadData data = ReadData.dataInput();
        //stores the matrix of numbers
        double numberMatrix[][] = CreateMatrix.makeMatrix(data.getMatrix());

        
    }
}