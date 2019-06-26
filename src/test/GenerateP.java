package test;/**
 * Created by 10736 on 2019/6/25.
 */

import java.util.Arrays;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2016
 * All rights reserved. 2019-06-25 22:27
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */
public class GenerateP {
    private int n;  //  求 1-n所有数字的全排列
    private final int maxn = 110;//最多可排列组合的长度  1-100
    private boolean [] hashTable;
    private int [] p;

    public GenerateP(int n) {
        // TODO Auto-generated constructor stub
        this.n = n;
        hashTable = new boolean[maxn];
        p = new int [maxn];
        Arrays.fill(hashTable, false);
        Arrays.fill(p, 0);
    }
    public void generatep(int index){
        if(index == n + 1){
            for(int i = 1; i <= n; i++){
                System.out.print(p[i]);
            }
            System.out.println();
            return;
        }

        for(int x = 1; x <= n; x++){
            if(hashTable[x] == false){
                p[index] = x;
                hashTable[x] = true;
                generatep(index + 1);
                hashTable[x] = false;
            }
        }
    }
}
class Main {

    public static void main(String[] args) {

        // TODO Auto-generated method stub
        GenerateP generateP = new GenerateP(6);
        generateP.generatep(1);

    }

}
