//Better
class Solution {
    public boolean isPalindrome(int x) {
        if (x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        while (x>rev){
            rev = rev*10 + x%10;
            x = x/10;
        }
        return (x==rev || x==rev/10);
    }
}


//String
class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int n = s.length();

        for (int i=0; i<n/2; i++) {
            if (s.charAt(i) != s.charAt(n-i-1)) return false;
        }
        return true;
    }
}


//Recursion
public class Solution {
    public static boolean isPalindrome(int i, String s){
        if (i>s.length()/2) return true;
        if (s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        return pal(i+1, s);
    }
}
//call: isPalindrome(0,s)
