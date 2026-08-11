//given a binary array nums,return the maximum number of consecutive 1's in the array.
//example1: input: nums=[1,1,0,1,1,1]
//output:3
//explaination:The first 2 digits and last three digits are consicative 1s.the maximum number of consecutive 1s is 3
//example 2:input:nums=[1,0,1,1,0,1]
//output:2
//constraints: 1<=nums.length<=10^5    nums[i] is either 0 or 1.

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=Arrays.stream(sc.nextLine().split(" ")).
                    mapToInt(Integer::parseInt).toArray();
        int maxCount=0,count=0;
        for(int num:arr){
            if(num==1){
                count++;
                if(count>maxCount)
                maxCount=count;
            }else
                count=0;
        }        
        System.out.println(maxCount);
    }
}
