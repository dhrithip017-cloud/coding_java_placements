//isPrime
import java.util.*;
class Main {
    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int deno = 2; deno <= Math.sqrt(n); deno++)
            if (n % deno == 0)
                return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> primeList = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++)
            if (isPrime(i))
                primeList.add(i);
        int sum = 2, count = 0;
        for (int num : primeList.subList(1, primeList.size())) {
            sum += num;
            if (sum <= n && isPrime(sum))
                count++;
        }
        System.out.println(count);
    }
}
//output 5    =1
