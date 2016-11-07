package com.java.se8.concurrent.futures;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.CompletableFuture;

/**
 * Created by ganesh.vallabhaneni on 3/16/2016.
 */
public class CompletionFuture {

    public static void main(String... args) {

        //First Chaining Pattern
        CompletableFuture.supplyAsync(() -> {
            System.out.println("Its Just Began");
            try {
                Thread.currentThread().sleep(10000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            System.out.println("inside Done");
            return null;
        }).thenAccept((test) -> {
            try {
                Files.createDirectory(Paths.get("c:\\test"), null);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        System.out.println("Its Done");

    }
}
