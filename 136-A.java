import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int friends[]=new int[n+1];
        for(int i=1;i<=n;i++)
            friends[scan.nextInt()]=i;
        for(int i=1; i<=n;i++)
            System.out.println(friends[i]+"");
            //4     2 3 4 1
            //4 1 2 3
    }
}
