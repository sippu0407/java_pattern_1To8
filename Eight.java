package pattern;
import java.util.*;
public class Eight {

    Scanner r=new Scanner(System.in);
    int n=r.nextInt();
 //important to close your Scanner object.
    int nsp1=n/2;
    int nsp2=-1;
    for(int rows=1;rows<=n;rows++){
        //space
       for(int j=1;j<=nsp1;j++)
         System.out.print(" ");
         
       System.out.print("*");
       
       if(rows!=1||rows!=n)
       System.out.print("*");

       for(int j=1;j<=nsp2;j++)
         System.out.print(" ");
       

    }

}
