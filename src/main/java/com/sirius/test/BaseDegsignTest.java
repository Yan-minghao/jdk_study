package com.sirius.test;

import org.junit.Test;

import java.io.Console;

/**
 * @author ymh sirius
 */
public class BaseDegsignTest {

    //静态方法，连接字符串
    @Test
    public void test01(){
        String join = String.join("Ymh_Sirius", "hello", "JAVA 基础");
        System.out.println(join);
    }
    //String jdk11及其以上  重复输出字符串次数
    @Test
    public void test02(){
        String repeat = "Ymh".repeat(100);
        System.out.println(repeat);

    }

    //String jdk11及其以上  重复输出字符串次数
    @Test
    public void test03(){
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer);
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder);
    }


    @Test
    public void test04(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("wHATE INS   123 qwe" +
//                "" +
//                ""   );
//        String s = scanner.nextLine();
//        System.out.println(s);
//        System.out.println(scanner.next());
//        System.out.println(scanner.nextInt());
        Console console = System.console(                                             );
        System.out.println(console);
    }
      @Test
      public void test05() {
        //格式化输出
        System.out.println(1000.0 / 3);
        System.out.printf("%8.2f\n", 10000.0 / 3);
    }



}