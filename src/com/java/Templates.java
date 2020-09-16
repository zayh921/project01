package com.java;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author xaindan
 * @date 2020/9/16 - 下午 2:39
 *
 * IDEA中代码模板所处的位置：setting - Editor -
 */
public class Templates {

    //模板六：prsf   不能写在函数里
    private static final test test1 = new test();
    //扩展：psfi /psfs
    public static final int INTZ = 0;
    public static final String STRING_INTZ = "";


    // 模板一：psvm / main
    public static void main(String[] args) {

        //模板二： sout
        System.out.println();
        //扩展：soutp / soutm / soutv / xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));

        System.out.println("Templates.main");

        int num1 = 10;
        System.out.println("num1 = " + num1);

        System.out.println("hello");

        //模板三：fori
        String[] arr = new String[]{"Tom","Jack","Kangkang"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }
        //扩展：iter
        for (String s : arr) {
            System.out.println(s);
        }
        
        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        for (Object o : list) {

        }
        //扩展:list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //扩展:list.forr  倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        //模板五：ifn
        if (list == null) {

        }
        //扩展：inn
        if (list != null) {

        }
        //扩展：xxx.null/xxx.nn
        if (list == null) {

        }
        if (list != null) {

        }

    }

    public void call(){

    }


}
