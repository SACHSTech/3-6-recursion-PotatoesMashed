package recursion;
public class EvenNumbersInARange{
    public static void printEvens(int start, int end) {
       if (start%2==0)
       System.out.print(start+" ");
       if (start>end){
         printEvens(start-1,end);
       } else if (end>start){
        printEvens(start+1, end);
       }
    }

    public static void main(String[] args) {
        printEvens(5, 29); // Output: 15
    }
}