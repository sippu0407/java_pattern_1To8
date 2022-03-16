package pattern;
import java.util.*;
public class Forth {
    public static void main(String args[]){

        Scanner r=new Scanner(System.in);
        int NoOfRows=r.nextInt();
        r.close(); //important to close your Scanner object.
        int nsp=NoOfRows-1;
        int nst=1;
        //rows
        for(int i=1;i<=NoOfRows;i++){

            //spaces per row
            for(int k=1;k<=nsp;k++){
                System.out.print(" ");

            }
            //* per column
            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
            nsp--;
            nst++;
            System.out.println();
        }
}
}
