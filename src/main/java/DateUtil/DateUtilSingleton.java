package DateUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtilSingleton {
    public static volatile DateUtilSingleton dateUtilSingleton = null;
    private DateUtilSingleton(){

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


    public static DateUtilSingleton getInstance() {
        if(dateUtilSingleton == null) {
            synchronized(DateUtilSingleton.class) {
                if(dateUtilSingleton == null ) {
                    System.out.println("--- creating instance ----");
                    dateUtilSingleton = new DateUtilSingleton();
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


}
