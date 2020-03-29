package com.java.test.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapTest {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<String,String>();
        map.put("1","张三" );
        map.put("2","李四" );
        map.put("3","王五" );

        //获取key的set集合，然后通过key拿到value
        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            System.out.println("key:"+s+"  value:"+map.get(s));
            System.out.println("git,test");
            System.out.println("gitdemo");
        }

       //获取迭代器，然后用while循环判断下表
        /*Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> stringEntry = iterator.next();
            System.out.println(stringEntry.getKey()+":"+stringEntry.getValue());
        }*/

        //通过map的entryset获取set集合直接用set里面的方法遍历+
        /*Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> stringStringEntry : entrySet) {
            System.out.println(stringStringEntry.getKey()+":"+stringStringEntry.getValue());
        }*/

        for (String value : map.values()) {
            System.out.println(value);
        }
    }

}
