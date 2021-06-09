package SingletonTestClass;

import ThreadsIde.Thread1;
import ThreadsIde.Thread2;

public class SingletonTest {
    public static void main(String[] args){
        Thread1 ct1 = new Thread1();
        Thread2 ct2 = new Thread2();

        ct1.start();
        ct2.start();
    }
}
