package test;/**
 * Created by 10736 on 2019/6/25.
 */

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2016
 * All rights reserved. 2019-06-25 22:00
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */
public class sort {
    private  int n;
    private  int []a;

    public  void  sortCollection(int index){
        if (index ==n+1){
            for(int i = 1; i <= n; i++){
                System.out.print(a[i]);
            }
            System.out.println();
            return;
        }else{
            for (int i = 1;i<=n;i++){
                a[i-1] = i;
                sortCollection(i+1);
            }
        }
    }
    public static void main(String[] args) {
        sort s = new sort();
        s.n =3;
        s.a = new int [3];
        s.sortCollection(1);
    }
}
