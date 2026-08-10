import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int untreated=0,availablePolice=0;
        int event;
        for(int i=1;i<=n;i++){
            event=scan.nextInt();
            if(event > 0)
            availablePolice+=event;
            else{
                if(availablePolice>0)
                availablePolice--;
                else
                untreated++;
            }
        }
        System.out.println(untreated);
        //3 -1 -1 1 2

    }
}
