//TCS (NQT)
//A chocolate factory is packing chocolates into the packets.The chocolate packets here represent an array of N number of interger values.The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).

//example1:
//N=8
//arr=4 5 0 1 9 0 5 0 
//There are 3 empty packets in the given set. These 3 empty packets represented as 0 should be pushed towards the end of the array.
//output: [4,5,1,9,5,0,0,0]
import java.util.*;
public class main{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cBelt[]=new int[n];
        for(int i=0;i<n;i++)
            cBelt[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            if(cBelt[i]==0){
                for(int j=i;j<n-1;j++)
                    cBelt[j]=cBelt[j+1];
                cBelt[n-1]=0;
            }
        }
        for(int ele:cBelt)
            System.out.print(ele +" ");
        //8
        //4 5 0 9 0 6 0 7
        //4 5 9 6 7 0 0 0 
    }
}
