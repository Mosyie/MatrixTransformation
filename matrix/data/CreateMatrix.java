package data;

//*Making matrix for parameter (command line argument or input) */
public abstract class CreateMatrix {
    
    //case for one row per line -> input
    public static double[][] makeMatrix(String[] input)
    {
        String[] row = new String[input.length];
        for(int j = 0; j < input.length; j++)
        {
            row[j] = input[j];
        }

        double[][] actualMatrix = new double[row.length][row.length];

        for(int i = 0; i < row.length; i++)
        {
            row[i] = row[i].substring(1, input[i].length() - 1);
            String[] k = row[i].split(",");
            for(int j = 0; j < row.length; j++)
            {

                actualMatrix[i][j] =  Double.parseDouble(k[j].trim());
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
