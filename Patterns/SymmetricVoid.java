public class Solution {
    public static void symmetry(int n) {
        // Write your code here
        for(int i=1; i<=n; i++){
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
    }
}


// Sample Input 1:
// 3
// Sample Output 1:
// * * * * * * 
// * *     * * 
// *         * 
// *         * 
// * *     * * 
// * * * * * * 
// Sample Input 2 :
// 1
// Sample Output 2 :
// * * 
// * * 
