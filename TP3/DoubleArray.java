class nullTable extends Exception{
    public nullTable(){
        super("Your table is empty !");
    }
}

public class DoubleArray {

    public static void main(String[] args) throws Exception {
        int x = 5;
        int y = 6;
    	double[][] m = new double[x][y];
        for(int i=0; i<x; i++) {
            for(int j=0; j<y; j++) {
                m[i][j] = i*j;
            }
        }
        display(m);
        boolean regu = regular(m);
        System.out.println("Regular ==> " + regu);
        double[] lineSumTest = lineSum(m);
        System.out.print("| ");
        for(int i=0; i<x; i++) {
            System.out.print(lineSumTest[i] +" |");
        }
    }

    private static boolean checkDouble(double[][] inputTable){
        if(inputTable != null && inputTable.length > 0){ 
            return true; 
        } else {
            return false;
        }
    }

    public static void display(double[][] inputTable) throws nullTable{
        if(checkDouble(inputTable)){
            int x = inputTable.length;
                for (int i = 0; i < x; i++) {
                    System.out.print("| ");
                    int y = inputTable[0].length;
                    for (int j=0; j<y; j++) {
                        System.out.print( inputTable[i][j] + " | ");               
                    }
                    System.out.println();
                }
        } else {
            throw new nullTable();
        }
    }

    public static boolean regular(double[][] inputTable) throws nullTable{
        if(checkDouble(inputTable)){
            int x = inputTable.length;
                for (int i = 0; i < x-1; i++) {
                    if( inputTable[i].length != inputTable[i+1].length){ return false ; }
                }
                return true;
        } else {
            throw new nullTable();
        }
    }

    public static double[] lineSum(double[][] inputTable) throws Exception{
        if(checkDouble(inputTable))
        {
            int x = inputTable.length;
            double[] outputTable = new double [x];
            if( regular(inputTable) )
            {
                int y = inputTable[0].length;
                for (int i = 0; i < x; i++) 
                {
                    double resultTemp = 0;
                    for(int j = 0; j < y; j++ )
                        {
                            resultTemp += inputTable[i][j];
                        }
                    outputTable[i] = resultTemp;
                }
                return outputTable;
            } else { throw new Exception("Table must be regular !");}
        } else {
            throw new nullTable();
        }
    }

    public static double[][] sum(double[][] firstTable, double[][] secondTable) throws nullTable{
        if(regular(firstTable) && regular(secondTable))
        {
            int lengthFirst = firstTable.length;
            if(lengthFirst == secondTable.length)
            {
                double[][] outputTable = new double [lengthFirst][];
                for(int i = 0; i < lengthFirst; i++)
                {
                    int lengthSecond = firstTable[i].length;
                    if(lengthSecond == secondTable[i].length)
                    {
                        for(int j = 0; j < lengthSecond ; j++)
                        {
                            outputTable[i][j] += firstTable[i][j];
                        }
                    }else
                    { 
                        return null;
                    }
                } return outputTable;
            }else 
            { 
                return null;
            }
        } else 
        { 
            return null;
        }
    }
}

