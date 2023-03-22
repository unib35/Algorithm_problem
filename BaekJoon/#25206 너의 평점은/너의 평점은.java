import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class Main {
    static int count = 20;
    static double totalCredit = 0.0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double totalScore = 0;
        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            //System.out.println(i + "score : " + score_transfer(credit, grade));
            totalScore += (score_transfer(credit, grade));
            //System.out.println(totalScore);

        }
        System.out.println(totalScore / totalCredit);
        //System.out.println("totalCredit : " + totalCredit);
        //System.out.println("count : " + count);
    }

    public static double score_transfer(double credit, String grade){
        totalCredit += credit;
        if(grade.equals("A+")){
            return 4.5 * credit;
        }else if(grade.equals("A0")){
            return 4.0 * credit;
        }else if(grade.equals("B+")){
            return 3.5 * credit;
        }else if(grade.equals("B0")){
            return 3.0 * credit;
        }else if(grade.equals("C+")){
            return 2.5 * credit;
        }else if(grade.equals("C0")){
            return 2.0 * credit;
        }else if(grade.equals("D+")){
            return 1.5 * credit;
        }else if(grade.equals("D0")){
            return 1.0 * credit;
        }else if(grade.equals("F")){
            return 0.0 * credit;
        } else if(grade.equals("P")){
            count--;
            totalCredit -= credit;
            return 0.0;
        } else{
            count--;
            totalCredit -= credit;
            return 0.0;
        }


    }

}