package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> keyItem = new ArrayList<>();
        keyItem.add("Good Rod");
        keyItem.add("Mach Bike");
        keyItem.add("TM Case");

        System.out.println(keyItem.size());
        System.out.println(keyItem);
        System.out.println(keyItem.get(0));
        System.out.println("\r");


        Map<Integer, String> bagPack = new HashMap<>() {{
            put(0, "keyItem");
            put(1, "item");
            put(2, "ball");
        }};

        System.out.println(bagPack.size());
        System.out.println("\r");


        Integer result1 = Calculation.doubleNum("48");
        System.out.println("result :" + result1);

        Integer result2 = Calculation.doubleNum("AKB48");
        System.out.println("result :" + result2);




    }

}