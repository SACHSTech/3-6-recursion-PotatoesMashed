package recursion;

public class CountDownTimer {
    public static void countDown(int n) {
        if (n!=0) {
            // recursive case
            System.out.print(n+" ");
            countDown(n-1);
        } else{
            // base case
        }
    }

    public static void main(String[] args) {
        countDown(5); // Output: 5 4 3 2 1
    }
}