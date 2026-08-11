// Google:
// 1 2 1 2 3 4 4 5 5
//Find the unpaired number in the given sequence
//output:3
//time:0(n)           space:0(1)

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=Arrays.stream(sc.nextLine().split(" ")).
                    mapToInt(Integer::parseInt).toArray();
        int unpaired =0;
        for(int n:arr)
            unpaired^=n;
        System.out.println(unpaired);
        
    }
}
