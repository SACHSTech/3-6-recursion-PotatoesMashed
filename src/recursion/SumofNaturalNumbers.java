package recursion;

public class SumofNaturalNumbers {
    public static int sum(int n) {
        if (n == 0) 
        // base case
            return 0;
        // recursive case
        return n + sum(n - 1);
        
    }

    public static void main(String[] args) {
        System.out.println(sum(5)); // Output: 15
    }
}
