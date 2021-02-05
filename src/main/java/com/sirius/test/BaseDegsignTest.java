package com.sirius.test;

import org.junit.Test;

import java.io.Console;
import java.math.BigDecimal;
import java.math.MathContext;

/**
 * @author ymh sirius
 */
public class BaseDegsignTest {

    //静态方法，连接字符串
    @Test
    public void test01() {
        String join = String.join("Ymh_Sirius", "hello", "JAVA 基础");
        System.out.println(join);
    }

    //String jdk11及其以上  重复输出字符串次数
    @Test
    public void test02() {
        String repeat = "Ymh".repeat(100);
        System.out.println(repeat);

    }

    //String jdk11及其以上  重复输出字符串次数
    @Test
    public void test03() {
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer);
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder);
    }


    @Test
    public void test04() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("wHATE INS   123 qwe" +
//                "" +
//                ""   );
//        String s = scanner.nextLine();
//        System.out.println(s);
//        System.out.println(scanner.next());
//        System.out.println(scanner.nextInt());
        Console console = System.console();
        System.out.println(console);
    }

    @Test
    public void test05() {
        //格式化输出
        System.out.println(1000.0 / 3);
        System.out.printf("%8.2f\n", 10000.0 / 3);
    }

    @Test
    public void test06() {
        //循环 while
//        int i = 10;
//        while (i < 0) {
//            System.out.println("i:" + i);
//            i--;
//        }
        System.out.println("—————————for—————");
        for (int j = 10; j > 0; j--) {
            System.out.println("i=" + j);
        }

    }

    @Test
    public void test07(){
        //大数 BigDecimal.ONE
        System.out.println(BigDecimal.ONE);
        System.out.println(BigDecimal.ZERO);
        System.out.println(BigDecimal.TEN);
        BigDecimal bigDecimal = new BigDecimal(1);
        BigDecimal bigDecimal1 = new BigDecimal(1024);
        System.out.println("-------------");
        System.out.println(bigDecimal.add(bigDecimal1));
        System.out.println(bigDecimal.subtract(bigDecimal1));
        System.out.println(bigDecimal.multiply(bigDecimal1));
        System.out.println(bigDecimal.divide(bigDecimal1));
        System.out.println("=========");
        System.out.println(bigDecimal1.sqrt(MathContext.DECIMAL32));
    }


}