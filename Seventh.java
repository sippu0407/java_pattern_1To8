package pattern;
import java.util.*;
public class Seventh {
    public static void main(String args[]){

        Scanner r=new Scanner(System.in);
        int NoOfRows=r.nextInt();
        r.close(); //important to close your Scanner object.
        int nsp=0;
        int nst=NoOfRows;
        //rows
        for(int i=1;i<=NoOfRows;i++){

            //spaces per row
            for(int k=1;k<=nsp;k++){
                System.out.print(" ");

            }
            //* per column
            
                System.out.print("*");
            
            nsp++;
           
            System.out.println();
        }
}
}