import java.math.BigInteger;
import java.io.*;

public class Main {
    static Long[] dp = new Long[100];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        dp[0] = 0L;
        dp[1] = 1L;

        fibonacci(n+1);
        System.out.println(dp[(int) n]);


    }
    public static long fibonacci(long n){
        if(dp[(int)n] == null){
            dp[(int)n] = fibonacci(n-1) + fibonacci(n-2);
        }
        return dp[(int)n];
    }
}