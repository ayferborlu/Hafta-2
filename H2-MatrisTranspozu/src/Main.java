// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int[][] a ={{1,2,3},{4,5,6},{7,8,9}};
       int[][] b = new int[3][3];
       System.out.println("Matris: ");

       for(int i=0; i<3; i++)
       {
       for(int j=0; j<3; j++)
       {

           System.out.print(a[i][j]+" ");
       }
       System.out.println();

       }
       System.out.println();
        System.out.println("Transpoze: ");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                b[i][j]=a[j][i];
                System.out.print(b[i][j]+" ");
            }
            System.out.println();

        }
    }
}