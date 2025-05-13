package recursion;
public class EvenNumbersInARange{
    public static void printEvens(int start, int end) {
       
       if (start%2==0)
       System.out.print(start+" ");
       //recursive case
       if (start>end){
         printEvens(start-1,end);
       } else if (end>start){
        printEvens(start+1, end);
       } else{
        //base case
       }
    }

    public static void main(String[] args) {
        printEvens(5, 29); // Output: 15
    }
}