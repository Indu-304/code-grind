public class Solution {
    public static void nLetterTriangle(int n) {
        for(int i=1; i<=n; i++){
            for(char c='A'; c<'A'+i; c++){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}

// Input: 3
// Output:
// A 
// A B 
// A B C 
