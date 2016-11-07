package com.java.se8.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by ganesh.vallabhaneni on 7/18/2015.
 */
public class MethodReferences2 {
    Consumable consumable = new Consumable();
    public static void main(String... args){
        int i = 10;
        MethodReferences2 obj = new MethodReferences2();
        obj.consumer(c -> c.str = c.flag+""+i);
    }

    public   void consumer(Consumer<Consumable> consumer){
        consumer.accept(consumable);
    }
}

class Consumable{
    boolean flag;
    String str ="";
}