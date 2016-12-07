package com.java.lessons;

import java.io.BufferedReader;
import java.net.DatagramPacket;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Yaroslav on 05.12.2016.
 */
public class Main {

//    {
//        System.out.print("1 ");
//
//    }
//
//    Main(){
//        System.out.print("2 ");
//    }


    private final Date date;

    public Main() {
        date = new Date();
    }


    public static void main(String[] args) {


        String[] arr = new String[7];
        String[] arr2 = arr.clone();

        System.out.println(arr);
        System.out.println(arr2);
//
//        Set<String> set = new HashSet<>();
//        set.add("c");
//        set.add("aaa");
//        set.add("b");
//
//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()){
//            if (iterator.next().equals("b")){
//                iterator.remove();
//            }
//        }
//
//     for (String s: set){
//         System.out.println(s);
//     }
//
//
//        for (String s: set) {
//            if (s.equals("b"))
//                set.remove(s);
//            System.out.println(s);
//        }
//    }

    }

}

//  5 3 1 2 4

//      1.  Статические элементы родителя
//      2.  Статические элементы наследника
//      3.  Глобальные переменные родителя
//      4.  Конструктор родителя
//      5.  Глобальные переменные наследника
//      6.  Конструктор наследника.