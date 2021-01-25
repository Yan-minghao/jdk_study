package com.sirius.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * @author ymh sirius
 */
public class ListTest {
    @Test
    public void test01(){
        List list = new ArrayList();
        list.add("11");
        list.add("22");
        list.add("33");
        list.add("44");
        System.out.println(list);
    }
    @Test
    public void test02(){
        /**
        *
        * 总结  对于 集合.of（） 都是进行对象操作，只读创建对象，暂不支持add 追加
        * @param ${tags}
        * @return ${return_type}
        */
        List<String> list = List.of("1", "2", "3");
         System.out.println(list);
        System.out.println(list.add("111"));
        System.out.println("--------");
        List<String> list02 = Arrays.asList("1", "2", "3");
        System.out.println(list02.add("4"));

        System.out.println("=================");
        Set<String> set = Set.of("1", "2", "23","1");
        System.out.println(set);

    }
}
