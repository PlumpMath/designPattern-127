package designPattern.singleton.entity;

/**
 * Created by ht002 on 2016/5/24.
 */
public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton(){};

    public static Singleton getInstance(){
        if(uniqueInstance==null){
            synchronized(Singleton.class){
                if(uniqueInstance==null){
                    uniqueInstance=new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
