package com.company;

import java.util.ArrayList;
import java.util.stream.Stream;

import static jdk.nashorn.internal.objects.NativeArray.reduce;

/**
 * Created by admin on 24.04.2017.
 */
public class ThreadSum extends Thread {
    ArrayList<Integer> mas;
    Stream stream;

    public void run() {

        for (int i =0; i< mas.size()-1; i++){
            int ii = i + 1;
        int sum = stream.reduce (mas.get(i), mas.get(ii));

        }

    }
}
