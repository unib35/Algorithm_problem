import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.Buffer;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int sec = Integer.parseInt(st.nextToken());
        int count = 0;
        Boolean[] arr = new Boolean[sec+1];
        Arrays.fill(arr,false);
        for(int i=0;i<n;i++){
            int num = Integer.parseInt(br.readLine());
            for(int j=1;j<=sec/num;j++){
                arr[j*num] = true;
            }
        }
        for(int k=0;k<=sec;k++){
            if(arr[k]==true){
                count++;
            }
        }
        System.out.println(count);
    }
}