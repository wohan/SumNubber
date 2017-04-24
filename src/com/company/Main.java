package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {



//        String[] fileWay = {"C:\\Users\\admin\\IdeaProjects\\textcalc\\tt.txt"};
//        //  ,"C:\\Users\\admin\\IdeaProjects\\textcalc\\tt1.txt","C:\\Users\\admin\\IdeaProjects\\textcalc\\tt2.txt"};
//
//
//        int quantityThread;
//        quantityThread = fileWay.length;
//
//        for (int i = 0; i < quantityThread; i++) {
////
////            Flow[i] = new TextRunner(fileWay[i], frequencyWords);
////            Flow[i].start();
////            System.out.println("Поток:  " + Flow[i].getName() + "    запущен!");
//        }
        List<Integer> one = new ArrayList<>();
        List<Integer> one2 = new ArrayList<>();
        List<Integer> one3 = new ArrayList<>();

        Random rnd = new Random();

        for(int i=0; i< 2000; i++){
            one.add(rnd.nextInt(100));
            one2.add(rnd.nextInt(100));
            one3.add(rnd.nextInt(100));
        }






    }
}
