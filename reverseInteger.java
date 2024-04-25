public class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int rem = x % 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0; // Overflow condition for positive numbers
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0; // Overflow condition for negative numbers
            }
            rev = rev * 10 + rem;
            x /= 10;
        }
        return rev;
    }
}

// ** Exception Case **
// Input
// x =
// 1534236469

// Use Testcase
// Output
// 1056389759
// Expected
// 0

// Basic solution
class Solution {
    public int reverse(int x) {
        int rev=0, sign=1, rem=0, t=x;
        if(x<0){
            t=-x;
            sign=0;
        }
        while(t>0){
            rem = t%10;
            rev = rev * 10 + rem;
            t /= 10;
        }
        if(sign==0)
            return -(rev);
        return rev;
    }
}
