package algorithm.Lanqiao.历届试题.第8届B;

import java.io.*;
import java.util.Scanner;

/**
 *
 */
public class PREV1 {
    public static void main(String[] args) {
        String path = "E:/sys/test/8/1/read.txt" ;
        float[] num=new float[100];
        float[] count=new float[100];
        try {
            Scanner in=new Scanner(new FileInputStream(path));
            float sum=0;
            while (in.hasNext()){

                float t=in.nextFloat();
                sum+=t;
                in.nextFloat();
                System.out.println(t);
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
