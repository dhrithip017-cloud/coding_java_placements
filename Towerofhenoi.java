//TOWER OF HENOI
import java.util.*;

public class main{
    public static void towerofhenoi(int n,char source,char helper,char dest){
        if (n==0)
            return;
        towerofhenoi(n-1,source,dest,helper);
        System.out.println("Move disk "+n+"from"+source+"to"+dest);
        towerofhenoi(n-1,helper,source,dest);
    }
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int disks =sc.nextInt();
        towerofhenoi(disks,'S','H','D');
    }
}

//OUTPUT
//Move disk 1 from S to D
//Move disk 2 from S to H
//Move disk 1 from D to H
//Move disk 3 from S to D
//Move disk 1 from H to S
//Move disk 2 from H to D
//Move disk 1 from S to D
