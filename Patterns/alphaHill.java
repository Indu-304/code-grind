public class Solution {
    public static void alphaHill(int n) {
        for(int i=1; i<=n; i++){
            for(int j=2*n-2*i-1; j>=0; j--){
                System.out.print(" ");
            }
            for(char c='A'; c< 'A'+i; c++){
                System.out.print(c + " ");
            }
            if(i>1){
                for(char d=(char)('A'+i-2); d>='A' ; d--){
                    System.out.print(d + " ");
                }
            }
            System.out.println();
        }
    }
}

// Sample Input 1:
// 3
// Sample Output 1:
//     A
//   A B A
// A B C B A
