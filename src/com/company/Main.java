package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        SmartPhone smartPhone1 = new SmartPhone("Samsung","S20",2020,"purple",1500);
        SmartPhone smartPhone2 = new SmartPhone("Apple","13",2021,"red",1800);
        SmartPhone smartPhone3 = new SmartPhone("Huawei","p40",2019,"blue",1200);
        SmartPhone smartPhone4 = new SmartPhone("Xiaomi","Mi 11",2021,"blue",1600);


        List<SmartPhone> smartPhones = new ArrayList<>();

        smartPhones.add(smartPhone1);
        smartPhones.add(smartPhone2);
        smartPhones.add(smartPhone3);
        smartPhones.add(smartPhone4);

        Collections.sort(smartPhones);

        double price = 0;

        for (SmartPhone s : smartPhones){
            System.out.println(s);
            if (price >s.getPrice()){

            }
        }


        System.out.print("Enter a filename: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        try {
            fileName = reader.readLine();

            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));

            SmartPhone mostExp = (SmartPhone)smartPhones.get(smartPhones.size()-1);



            writer.println("Model name: " + mostExp.getModel()+ " \r" +"Year: "+ mostExp.getYear()+ "\r" +"Price: " + mostExp.getPrice());
            writer.close();
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
