// You are given an array of itegers,arr,and an integer k. Your task is to find and print the maximum number in each contiguous window of size k.
//sample test case 1:
//input: arr=[1,3,-1,-3,5,3,6,7]    k=3
//output:[3,3,5,5,6,7]
import java.util.*;
public class main{
    public static int findmax(int arr[],int start,int end){
        int max=arr[start];
        for(int i=start;i<=end;i++)
            if(arr[i]>max)
                max=arr[i];
        return max;
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int arr2[]=Arrays.stream(sc.nextLine().split("")).mapToInt(Integer::parseInt).toArray();
       int k=sc.nextInt();
       int result[]=new int[arr2.length-k+1];
       for(int i=0;p=0;i<arr2.length-k+1;i++){
           findMax(arr2,i,i+k-1);
       }
    }
}
