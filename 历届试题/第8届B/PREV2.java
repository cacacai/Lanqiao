package algorithm.Lanqiao.历届试题.第8届B;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 *
 * A,2,3,4,5,6,7,8,9 共9张纸牌排成一个正三角形（A按1计算）。要求每个边的和相等。

 下图就是一种排法（如有对齐问题，参看p1.png）。
     A
    9 6
   4   8
  3 7 5 2
 这样的排法可能会有很多。
 如果考虑旋转、镜像后相同的算同一种，一共有多少种不同的排法呢？
 请你计算并提交该数字。
 注意：需要提交的是一个整数，不要提交任何多余内容。A,2,3,4,5,6,7,8,9 共9张纸牌排成一个正三角形（A按1计算）。要求每个边的和相等。
 下图就是一种排法（如有对齐问题，参看p1.png）。
 这样的排法可能会有很多。
 如果考虑旋转、镜像后相同的算同一种，一共有多少种不同的排法呢？
 请你计算并提交该数字。
 注意：需要提交的是一个整数，不要提交任何多余内容。
 */

public class PREV2 {
    static int a[] = new int[10];
    static int ed[] = new int[10];
    static int min = 0;
    public static void main(String[] args) {
            dfs(1);
            System.out.println(min / 6);//镜像 旋转在此除以6
        }

        private static void dfs(int n){
            if (n==10){
                jugde();
            }
            for (int i = 1; i < 10; i++) {
                if (ed[i]==0){
                    ed[i]=1;
                    a[n]=i;
                    dfs(n+1);
                    ed[i]=0;
                }
            }


        }

        private static void jugde(){
            int[] b=new int[3];
            b[0]=a[1]+a[2]+a[3]+a[4];
            b[1]=a[4]+a[5]+a[6]+a[7];
            b[2]=a[1]+a[7]+a[8]+a[9];
            if (b[0]==b[1]&&b[1]==b[2]){
                System.out.println(Arrays.toString(a));
                min++;
            }
        }
}
