public class PenjumlahanMatriks
{
    public static void main(String[] args)
    {
        int i, j;

        int matriksA[][] = new int [2][2]; 
        matriksA[0][0] = 1;
        matriksA[0][1] = 2;
        matriksA[1][0] = 3;
        matriksA[1][1] = 4;

        int matriksB[][] = new int [2][2];
        matriksB[0][0] = 5;
        matriksB[0][1] = 6;
        matriksB[1][0] = 7;
        matriksB[1][1] = 8;
      
        System.out.println("Matriks A");
        for (j = 0; j < matriksA[0].length; j++) {
            System.out.print("|");
            for (i = 0; i < matriksA.length; i++) {
                System.out.print(" "+matriksA[i][j]+" ");
            }
            System.out.print("|");            
            System.out.println();
        }
        
        System.out.println("Matriks B");
        for (j = 0; j < matriksB[0].length; j++) {
            System.out.print("|");
            for (i = 0; i < matriksB.length; i++) {
                System.out.print(" "+matriksB[i][j]+" ");
            }
            System.out.print("|");
            System.out.println();
        }

        System.out.println("Hasil penjumlahan dari matriks A dan B");
        for ( j = 0; j < matriksA.length; j++){
            System.out.print("|");
            for (i = 0; i < matriksA[0].length; i++){
                int sum = matriksA[i][j] + matriksB[i][j]; 
                System.out.print( " "+sum+ " ");
            }       
            System.out.print("|");
            System.out.println();
        }
        /* for (j = 0; j < matriksA[0].length; j++) {
            System.out.print("|");
            for (i = 0; i < matriksA.length; i++) {
                sum = matriksA[i][j] + matriksB[i][j];
                System.out.println(sum[i][j]);
            }
        } */
        

        

    } 
}