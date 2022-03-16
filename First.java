package pattern;

import java.util.*;
public class First{

    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        scn.close();
        int nst=n;
        //rows
        for(int i=0;i<n;i++){
            //columns
            for(int j=0;j<nst;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}