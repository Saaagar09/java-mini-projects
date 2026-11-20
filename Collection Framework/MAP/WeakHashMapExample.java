
/*  stores keys using weak reference , it holds weak references to its keys .If GC do not found any strong reference  it may remove it from memory */

import java.util.WeakHashMap;

public class WeakHashMapExample {

    public static void main(String[] args) throws InterruptedException {

        WeakHashMap<Object, String> map = new WeakHashMap<>();

        Object key1 = new Object();
        Object key2 = new Object();

        map.put(key1, "Rohan");
        map.put(key2, "Vishal");

        System.out.println("Before GC: " + map);

        key1 = null;
        key2 = null;

        System.gc();

        Thread.sleep(1000);

        System.out.println("After GC: " + map);
    }
}