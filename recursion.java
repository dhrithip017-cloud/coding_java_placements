//Printing name using REcursion(User input)
import java.util.*;
class main {
    public static void printName(String name, int n) {
        if (n < 0)
            return;
        else {
            printName(name, n - 1);
            char ch = name.charAt(n);
            System.out.println(ch);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int n = name.length();
        printName(name, n - 1);
    }
}
//output: DHRITHI
//D
//H
//R
//I
//T
//H
//I

//Reversing
import java.util.*;
class main {
    public static void printName(String name, int n) {
        if (n < 0)
            return;
        else {
            char ch = name.charAt(n);
            System.out.print(ch);
            printName(name, n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int n = name.length();
        printName(name, n - 1);
    }
}
//output: DHRITHI  IHTIRHD
