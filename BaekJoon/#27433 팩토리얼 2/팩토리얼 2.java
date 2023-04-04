import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.Buffer;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        BigInteger result = new BigInteger("1");
        for(int i=1;i<=n;i++){
            result = result.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println(result);
    }
}