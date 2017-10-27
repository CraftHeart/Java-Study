package ch3;

/**
 * Created by wsn on 2017/10/27.
 */
public class StringBuilderDemo {
    /*
    * 问题：想要把一些字符串拼接起来
    * 解决方法：最简单的方法是使用+号操作符，但是需要注意的是，在使用+操作符的时候，编译器会隐式调用StringBuilder*/
    static void strBuilderDemo() {
        String str1 = "Hello" + " " + "World";
        System.out.println(str1);

        // 创建一个StringBuilder，并调用它的append()方法向其后面添加字符串
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Hello");
        stringBuilder1.append(" ");
        stringBuilder1.append("World");
        // 得到StringBuilder的值，并转换成String对象
        String str2 = stringBuilder1.toString();
        System.out.println(str2);
        // 我们也可以连续调用append()方法
        System.out.println(new StringBuilder().append("Hello").append(" ").append("World"));
    }

    /*
    * 问题：需要一次处理字符串的一个字符
    * 解决方法：使用for循环以及String的charAt()方法，或者使用for each循环以及String的toCharArray()方法*/
    static void processCharDemo() {
        String string = "I am cuberqiu";
        // 使用for循环以及charAt()方法
        for(int i=0;i<string.length();++i) {
            System.out.println("char" + i + "is" + string.charAt(i));
        }
        // 使用for each循环以及toCharArray()方法
        for (char s : string.toCharArray()) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        strBuilderDemo();
    }
}
