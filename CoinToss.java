//Basic coin toss question
//Givwn N,print all possible statements of N coin tosses.
//Input:2
//output:HH HT TH TT

import java.util.*;
public class main{
    public static void flipcoins(String tossed,int n){
        if (n<=0){
            System.out.println(tossed);
            return;
        }
        flipcoins(tossed+"T",n-1);
        flipcoins(tossed+"H",n-1);
    }
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        flipcoins("",n);
    }
}
