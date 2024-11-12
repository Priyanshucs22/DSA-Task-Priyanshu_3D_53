/*Given an integer n, return the number of prime numbers that are strictly less than n.
Example 1:
Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
Example 2:
Input: n = 0
Output: 0
Example 3:
Input: n = 1
Output: 0
Constraints:
0 <= n <= 5 * 106 */
public class Count_Primes_204 {
    public int countPrimes(int n) {
        int isPrime[]=new int[n];
        if(n==0 || n==1) return 0;
        isPrime[0]=isPrime[1]=1;
        for(int i=2;i*i<n;i++){
            if(isPrime[i]==0){
                for(int j=i*2;j<n;j+=i){
                    isPrime[j]=1;
                }
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(isPrime[i]==0){
                c++;
            }
        }
        return c;
    }
}
