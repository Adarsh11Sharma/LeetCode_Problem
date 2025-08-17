import java.util.*;



class new21Game {
    public static double new21Game(int n, int k, int maxPts) {
        if (k == 0 || n >= k + maxPts) {
            return 1.0;
        }
        double[] dp = new double[n + 1];
        dp[0] = 1.0;
        double windowSum = 1.0;
        double result = 0.0;
        
        for (int i = 1; i <= n; i++) {
            dp[i] = windowSum / maxPts;
            if (i < k) {
                windowSum += dp[i];
            } else {
                result += dp[i];
            }
            if (i >= maxPts) {
                windowSum -= dp[i - maxPts];
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        int  k=sc.nextInt();
        int  maxPts=sc.nextInt();

        double ans= new21Game(n,k,maxPts);
        System.out.println(ans);
    }
}