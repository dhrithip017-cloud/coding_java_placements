import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        HashSet<Character>set=new HashSet<>();
        for(Character ch: s.toUpperCase().toCharArray())
            set.add(ch);
        if(set.size()>=26)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
//12
//toosmallword     //NO

//35
//TheQuickBrownFoxJumpsOverTheLazyDog    //YES
