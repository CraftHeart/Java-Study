package ch3;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

/**
 * Created by wsn on 2017/10/27.
 */
public class StringApartDemo {
    /*
    * 问题：通过下标索引来分割字符串
    * 解决方法：使用String对象的substring()方法
    * 讨论：substring()会构建一个新的String对象，对象由substring()的参数决定，substring也是一个重载函数，可以有一个参数
    * 也可以有两个参数，一个参数则是从该位置到最后的位置，因此，也可以用indexOf()或者lastIndexOf()来产生索引。
    * 注意，substring()函数是左闭右开的
    * */
    static void subStringDemo() {
        String str = "java is great.";
        System.out.println(str);
        String str1 = str.substring(1);
        System.out.println(str1);
        String str2 = str.substring(1, 3);
        System.out.println(str2);
        String str3 = str.substring(str.indexOf('a'), str.lastIndexOf('a'));
        System.out.println(str3);
    }

    /*
    * 问题：讲字符串以word或者token的形式分割
    * 解决方法：构建一个StringTokenizer对象，并调用它的hasMoreTokens()和nextToken()方法。或者使用正则表达式*/
    static void splitStringDemo() {
        String str = "java is great.";

        /*最简单的方法就是使用正则表达式，当分离空格符的时候，可以直接使用String对象的split方法*/
        for(String word:str.split(" "))
            System.out.println(word);
        // 如果要匹配多个连续的空格，使用"\s+"
        String str1 = "java  is   great.";
        for(String word:str1.split("\\s+"))
            System.out.println(word);

        /*另外一种方法就是使用StringTokenizer.
        * 注意：StringTokenizer中的hasMoreTokens()方法和hasMoreElements()方法都是返回是否有下一个分隔符
        * nextElement()方法和nextToken()方法都是返回当前位置到下一个分隔符的字符串
        * hasMoreElements()是为了实现枚举才有的*/
        StringTokenizer st = new StringTokenizer("java is great.");
//        while (st.hasMoreTokens()) {
//            System.out.println(st.nextToken());
//        }

        while (st.hasMoreElements()) {
            System.out.println("next element:"+st.nextElement());
        }

        StringTokenizer st1 = new StringTokenizer("java,is|great.", ",|");
        while (st1.hasMoreElements()) {
            System.out.println(st1.nextElement());
        }
    }
    public static void main(String[] args) {
//        subStringDemo();
        splitStringDemo();


    }

}
