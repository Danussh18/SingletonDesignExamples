package ClonableSingleton;

import DateUtil.DateUtilSingleton;

public class Thread1 extends Thread {
    public void run() {
        DateUtilSingleton dateUtil = DateUtilSingleton.getInstance();
        System.out.println("hashCode = "+ dateUtil.hashCode());
        System.out.println(Thread.currentThread().getName()+" : "+dateUtil.getDate());
    }
}
