import java.math.BigInteger;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static Long[] dp = new Long[100];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();


        //n과 m 사이의 소수찾는 문제
        for(int i = n; i <= m; i++){
            if(isPrime(i)){
                sum += i;
                list.add(i);
            }
        }
        if(sum == 0){
            System.out.println(-1);
        } else{
            System.out.println(sum);
            System.out.println(list.get(0));
        }



    }

    private static boolean isPrime(int i) {
        if(i == 1) return false;
        for(int j = 2; j <= Math.sqrt(i); j++){
            if(i % j == 0) return false;
        }
        return true;
    }
}