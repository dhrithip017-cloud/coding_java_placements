import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int t=scan.nextInt();
        String s=scan.next();
        while(t-->0){
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i)=='B' && s.charAt(i+1)=='G'){
                    s=s.substring(0,i)+"GB"+s.substring(i+2);
                    i++;
                }
            }
        }
        System.out.println(s);
}
}
