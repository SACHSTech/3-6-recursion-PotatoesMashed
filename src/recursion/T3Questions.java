package recursion;
import java.util.*;
import java.util.ArrayList;

public class T3Questions {
    public static int sumArray(int[] arr, int n){
        if (n>0)
        //recursive case
        return arr[n-1]+sumArray(arr, n-1);
        //base case
        return 0;
    }

    public static int findMax(int[] arr, int n){
        if (n>0)
        //recursive case
        return findMax(arr, n-1)>arr[n-1] ? findMax(arr, n-1) : arr[n-1];
        //base case
        return arr[0];
    }

    public static int countChar(String s, char c){
        if (s.length()!=1)
        //recusive case
        return (s.charAt(0)==c? 1:0)+countChar(s.substring(1), c); 
        //base case
        return s.charAt(0)==c? 1:0;
    }

    public static ArrayList<String> generateSubsets( String s) {
        ArrayList<String> temp= new ArrayList<String>();
        if (s.length()>0){
            //recursive case
            for(String p:generateSubsets(s.substring(1))){
                temp.add(p);
                temp.add(s.charAt(0)+p);
            }

        }else{
            //base case
            temp.add(s);
        }
        return (temp);
    }

    


    public static void main(String[] args){
        int[] a={1, 2, 3, 4, 8, 2, 2, 5, 3, 2};
        System.out.println(sumArray(a,4));
        System.out.println(findMax(a, 10));
        System.out.println(countChar("hello", 'l'));
        for (String s:generateSubsets("abcd")){
            System.out.println("\""+s+"\"");
        }
    }
}
