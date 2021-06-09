package ThreadsIde;

import DateUtil.DateUtilSingleton;

public class Thread2 extends Thread {
    public void run(){
        DateUtilSingleton dateUtil = DateUtilSingleton.getInstance();
        System.out.println("hashCode = "+ dateUtil.hashCode());
        System.out.println(Thread.currentThread().getName()+" : "+dateUtil.getDate());
    }
}
