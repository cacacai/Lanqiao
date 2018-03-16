package algorithm.Lanqiao.历届试题.第8届B;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class PREV3 {
    public static void main(String[] args) {
        try {
            Scanner in=new Scanner(new FileInputStream("E:/sys/test/8/3/read.txt"));
            float[][] nums= new float[31][31];
            int j=0;
            while (j<29){
                for (int i = 0; i <= j; i++) {
                    nums[j][i]=in.nextFloat();
                }
                System.out.println(Arrays.toString(nums[j]));
                j++;

            }
            for (int i = 1; i < 30; i++) {
                for (int k = 0; k <= i; k++) {
                    if (k == 0) {
                        nums[i][k] += nums[i - 1][k] * 1.0 / 2;
                    } else {
                        nums[i][k] += nums[i - 1][k] * 1.0 / 2 + nums[i - 1][k - 1] * 1.0 / 2;
                    }
                }
            }
            Arrays.sort(nums[29]);
            System.out.println(Arrays.toString(nums[29]));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
