import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int candies[]=new int[n];
            for(int i=0;i<n;i++)
                candies[i]=sc.nextInt();
            int newBox=candies[0],minTime=0;
            for(int i=1;i<n;i++){
                newBox+=candies[i];
                minTime+=newBox;
            }
            System.out.println(minTime);
        }
    }
}
