package ClonableSingleton;

import DateUtil.DateUtilSingleton;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtilSingletonClone implements Cloneable {
    public static volatile DateUtilSingletonClone dateUtilSingleton = null;
    private DateUtilSingletonClone() {

    }

//    public static DateUtilSingleton getInstance(){
//        if(dateUtilSingleton==null)
//        {
//            System.out.println("------Creating Instance of DateUtil--------");
//            dateUtilSingleton = new DateUtilSingleton();
//        }
//        return dateUtilSingleton;
//    }

//    public static DateUtilSingleton getInstance() {
//     synchronized(DateUtilSingleton.class){
//        if(dateUtilSingleton == null) {
//            System.out.println("--- creating instance ----");
//            dateUtilSingleton = new DateUtilSingleton();
//        }
//     }
//     return dateUtilSingleton;
//    }

    public static DateUtilSingletonClone getInstance() {
        if(dateUtilSingleton == null) {
            synchronized(DateUtilSingletonClone.class) {
                if(dateUtilSingleton == null ) {
                    System.out.println("--- creating instance ----");
                    dateUtilSingleton = new DateUtilSingletonClone();
                }
            }
        }
        return dateUtilSingleton;
    }

    public String getDate() {
        Date today = new Date();
        SimpleDateFormat sFormat = new SimpleDateFormat("dd-MMM-yyyy");
        return sFormat.format(today);
    }

//    public Object readResolve(){
//        System.out.println("---------In Read Resolve------------");
//        return dateUtilSingleton;
//    }

    public Object clone() throws CloneNotSupportedException {
//        DateUtilSingleton dateUtilSingleton1 = (DateUtilSingleton) super.clone();
//        return dateUtilSingleton1;


//        return super.clone();
        throw  new CloneNotSupportedException("Cloning is not supported For Singleton Object!");
    }
}
