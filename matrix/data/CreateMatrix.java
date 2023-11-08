package data;

//*Making matrix for parameter (command line argument or input) */
public abstract class CreateMatrix {
    
    //case for one row per line -> input
    public static double[][] makeMatrix(String[] input) throws inputException
    {
        String[] row = new String[input.length];
        for(int j = 0; j < input.length; j++)
        {
            row[j] = input[j];
        }

        final int rowLenght = row[0].substring(1,input[0].length() - 1).length();
        double[][] actualMatrix = new double[row.length][row.length];

        for(int i = 0; i < row.length; i++)
        {
            row[i] = row[i].substring(1, input[i].length() - 1);
            String[] currentElementsFromRow = row[i].split(",");

            if(row[i].length() != rowLenght)
            {
                throw new inputException("Need to input an N x N matrix!");
            }

            for(int j = 0; j < row.length; j++)
            {
                try
                {
                    actualMatrix[i][j] =  Double.parseDouble(currentElementsFromRow[j].trim());
                }
                catch(NumberFormatException ex)
                {
                    System.err.println("Only numbers can exist in the matrix!");
                }
            }
        }
        return actualMatrix;
    }

    //case for full matrix -> command line argument
    /*public static double[][] makeMatrix(String[] input)
    {
        //todo
    }*/
}
