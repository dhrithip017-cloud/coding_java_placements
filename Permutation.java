//1.PERMUTATIONS(String)
//Given a String,print all permutations of the string using recursion.
//Approach1: Fix one character,permute the rest
//>pick one character >fix it at the current position >recursively permutue remaining characters
//input: str="abc"
//output: abc acb bac bca cab cba

import java.util.*;
class main {
    public static void permu(String prefix, String remaining) {
        if (remaining.length()==0){
            System.out.println(prefix);
        return;
        }
        for(int i=0;i<remaining.length();i++){
            char ch = remaining.charAt(i);
            String nextRemaining=remaining.substring(0,i)+remaining.substring(i+1);
            permu(prefix+ch,nextRemaining);
        }    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        permu("",input);
    }
}
