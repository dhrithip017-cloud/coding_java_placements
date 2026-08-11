//Find the minimum Number of flips to make binary string alternate
//Input:str="001"
//output:1
//Minimum number of flips required=1
//we can flip 1st bit from 0 to 1
//input:str!="000101011"

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        int countFlip01 = 0, countFlip10 = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (i % 2 == 0 && binary.charAt(i) == '1')
                countFlip01++;
            if (i % 2 == 1 && binary.charAt(i) == '0')
                countFlip01++;
            if (i % 2 == 0 && binary.charAt(i) == '0')
                countFlip10++;
            if (i % 2 == 1 && binary.charAt(i) == '1')
                countFlip10++;
        }
        System.out.println(Math.min(countFlip10, countFlip01));
    }
}
