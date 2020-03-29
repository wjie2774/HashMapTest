package com.java.test.mode;

/*
* 单例模式的chuangjian
* 饿汉模式，类加载时即创建
* */
public class ModeTest1 {
    private static ModeTest1 modeTest1=new ModeTest1();
    public static ModeTest1 getInstance(){
        return modeTest1;
    }
}

/*
* 饱汉模式：延迟加载，此方法加入了synchronized关键词，不会存在线程安全问题
*
* */
class ModeTest2{
    private static  ModeTest2 modeTest2=null;

    public static ModeTest2 getInstance(){
        if(modeTest2==null){
            synchronized (ModeTest2.class){
                if(modeTest2==null){
                    modeTest2=new ModeTest2();
                }
            }
        }
        return modeTest2;
    }
}

/*
* 饱汉模式更优雅的方式
* 利用类的加载顺序
* */
class ModeTest3{
    private ModeTest3(){

    }

    public static ModeTest3 getInstance(){
        return getHolder.MODE_TEST_3;
    }
    private final static class getHolder{
        private static final ModeTest3 MODE_TEST_3=new ModeTest3();
    }
}
