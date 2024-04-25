public class Solution {
    public static void symmetry(int n) {
        for(int i=n; i>=1; i--){
            for(int j=n-i+1; j>=1; j--){
                System.out.print("* ");
            }
            for(int k=0; k<2*i-2; k+=2){
                System.out.print("    ");
            }
            for(int l=n-i+1; l>=1; l--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=2; i<=n; i++){
            for(int j=n-i+1; j>=1; j--){
                System.out.print("* ");
            }
            for(int k=0; k<2*i-2; k+=2){
                System.out.print("    ");
            }
            for(int l=n-i+1; l>=1; l--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// Sample Input 1:
// 3
// Sample Output 1:
// *         *
// * *     * *
// * * * * * *
// * *     * *
// *         *
