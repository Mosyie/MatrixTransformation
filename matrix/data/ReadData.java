package data;

import java.util.Scanner;

//todo - CHECK MATRIX SIZE - CAN ONLY BE N x N

public class ReadData {

    private int lineLength;
    private String[] matrix;
    private String type; 

    public ReadData(int l, String[] s, String t)
    {
        this.lineLength = l;
        this.matrix = s;
        this.type = t;
    }

    /*Reading data from the input in the correct format */
    public static ReadData dataInput()
    {
        Scanner scanINPUT = new Scanner(System.in);
    
        int lineL = scanINPUT.nextInt();
        scanINPUT.nextLine();
        String[] inputMatrix = new String[lineL];
        String type = "";

        for(int i = 0; i < lineL; i++)
        {
            inputMatrix[i] = scanINPUT.nextLine();
        }
       

        type = scanINPUT.nextLine();
        scanINPUT.close();
        return new ReadData(lineL, inputMatrix, type);
    }


    public String[] getMatrix()
    {
        String [] copy = new String[matrix.length];
        for(int i = 0; i < matrix.length; i++)
        {
            copy[i] = this.matrix[i];
        }
        return copy;
    }


    /*Showcasing the read data */
    public @Override String toString()
    {
        StringBuilder s = new StringBuilder();
        s.append("\nLineLenght: " + lineLength).append("\n"+matrix[0] +"\n"+matrix[1]+"\n"+matrix[2]).append("\nType: " + type + "\n");
        return s.toString();
    }
}
