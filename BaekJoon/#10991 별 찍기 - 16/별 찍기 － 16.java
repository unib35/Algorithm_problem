import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.Buffer;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()) + 1;

        for(int i=n-1;i>0;i--){
            for(int j=0;j<i-1;j++){
                System.out.print(" ");
            }
            for(int k=n;k>i;k--){
                System.out.print("* ");
            }
            System.out.println("");

        }
    }
}