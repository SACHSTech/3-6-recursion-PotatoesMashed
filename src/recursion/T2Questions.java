package recursion;

public class T2Questions {
    public static String reverse(String s){
        if (s.length()!=1)
        //recusive case
        return s.substring(s.length()-1) + reverse(s.substring(0, s.length()-1));
        //base case
        return s;
    }

    public static boolean isPalindrome(String s){
        if (s.length()>1)
        //recusive case
        return (s.charAt(0)==s.charAt(s.length()-1))&&isPalindrome(s.substring(1,s.length()-1));
        //base case
        return true;
    }

    public static int power(int base, int exponent){
        if (exponent!=0)
        //recursive case
        return base*power(base, exponent-1);
        //base case
        return 1;
    }
    
    public static String toBinary(int n){
        if (n>1)
        // recursive case
        return toBinary(n/2)+(n%2);
        // base case
        return n+"";
    }

    public static int sumOfDigits(int n){
        if (n!=0)
        //recursive case
        return n%10+sumOfDigits(n/10);
        //base case
        return 0;
    }


    public static void main(String[] args){
        System.out.println(reverse("qwerty"));
        System.out.println(isPalindrome("qwertyytrewq"));
        System.out.println(isPalindrome("qwertytrewq"));
        System.out.println(isPalindrome("qwerytrewq"));
        System.out.println(toBinary(10));
        System.out.println(sumOfDigits(123456));

    }
}
