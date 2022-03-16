package pattern;
import java.util.*;
public class Third {
    public static void main(String args[]){

        Scanner k=new Scanner(System.in);
        int NoOfRows=k.nextInt();
        k.close(); //important to close your Scanner object.
        int nst='A';
        for(int i=1;i<=NoOfRows;i++){
            for(int j='A';j<=nst;j++){
                System.out.print((char)nst+" ");
            }
            nst++;
            System.out.println();
        }
    }
    
}
