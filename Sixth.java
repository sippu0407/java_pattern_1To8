package pattern;
import java.util.*;
public class Sixth {
    public static void main(String args[]){

        Scanner r=new Scanner(System.in);
        int NoOfRows=r.nextInt();
        r.close(); //important to close your Scanner object.
        int nsp=(NoOfRows-1)/2;
        int nst=1;
        //rows
        for(int i=1;i<=NoOfRows;i++){

            //spaces before star
            for(int k=1;k<=nsp;k++){
                System.out.print("*");

            }
            //* per column
            for(int j=1;j<=nst;j++){
                System.out.print(" ");
            }
            //spaces after stars
            for(int l=1;l<=nsp;l++){
                System.out.print("*");

            }
          

            if(i<=NoOfRows/2)
                nst+=2;
            else 
                nst-=2;  


            nsp=(NoOfRows-nst)/2;    
            System.out.println();
        }
}
    
}
