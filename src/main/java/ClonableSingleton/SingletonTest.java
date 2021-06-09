package ClonableSingleton;

import DateUtil.DateUtilSingleton;
import ThreadsIde.Thread1;
import ThreadsIde.Thread2;

public class SingletonTest  {

    public static void main(String[] args) throws InterruptedException {
        Thread1 ct1 = new Thread1();
        Thread2 ct2 = new Thread2();

        ct1.start();
        ct2.start();

        ct1.join();
        ct2.join();
//        System.out.println("--------------------------------------------");
//        System.out.println("-------------After Serialization------------");
//        System.out.println("--------------------------------------------");
        DateUtilSingleton dateUtilSingleton = DateUtilSingleton.getInstance();
//        System.out.println(dateUtilSingleton.getClass());
//
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/dateUtil.ser"));
//        objectOutputStream.writeObject(dateUtilSingleton);
//
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/dateUtil.ser"));
//
//        DateUtilSingleton dateUtilSingleton2 = (DateUtilSingleton) objectInputStream.readObject();
//        System.out.println(dateUtilSingleton2.getDate());
//        System.out.println(dateUtilSingleton==dateUtilSingleton2);
//        System.out.println(dateUtilSingleton.hashCode()+" "+dateUtilSingleton2.hashCode());
//
//        DateUtilSingleton dateUtilSingleton2 = (DateUtilSingleton) dateUtilSingleton.clone();
        System.out.println(dateUtilSingleton.hashCode());
    }
}
