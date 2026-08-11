//Given an integer n,write a function that returns count of trailing zeros in n!
//Example:input:n=5   output:1     factorial of 5 is 120which has one trailing 0

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        while (fact % 10 == 0) {
            count++;
            fact = fact / 10;
        }
        System.out.println(count);
    }
}
