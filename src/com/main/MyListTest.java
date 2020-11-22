package com.main;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        print(myList.getElements());
        System.out.println("---");
        System.out.println(myList.indexOf(1));
        System.out.println("---");
        System.out.println(myList.indexOf(5));
        System.out.println("---");
        myList.remove(0);
        print(myList.getElements());
        System.out.println("---");
        myList.add(10, 0);
        print(myList.getElements());
        System.out.println("---");
        MyList<Integer> clone = myList.clone();
        System.out.println(clone.contains(2));
        System.out.println("---");
        System.out.println(clone.get(1));
        System.out.println("---");
        clone.clear();
        System.out.println(clone.size());
        System.out.println("---");
        print(myList.getElements());


    }

    static void print(Object[] mylist) {
        for (Object e : mylist) {
            if (!(e == null)) {
                System.out.println((Integer) e);
            }
        }
    }
}
