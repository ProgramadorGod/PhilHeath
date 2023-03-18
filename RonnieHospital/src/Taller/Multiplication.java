package Taller;

import java.util.ArrayList;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        System.out.println("===================================");
        System.out.println("   Program to multiply 3 nums      ");
        System.out.println("===================================");
        float Highest, Lowest,Product;
        float Nums[] = new float[5];
        int Cicle = 1;
        float Intermediary = 0;
        ArrayList<Float> NumsKeeper = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < Nums.length; i++) {

            System.out.println("Insert the number "+ Cicle +": ");
            Cicle+= 1;
            Nums[i] = in.nextFloat();
            NumsKeeper.add(Nums[i]);

        }



        for (int i = 0; i < NumsKeeper.size(); i++) {
            if(NumsKeeper.get(i)>Intermediary){
                Intermediary = NumsKeeper.get(i);
            }

        }

        Highest = Intermediary;
        for (int i = 0; i < NumsKeeper.size(); i++) {
            if(NumsKeeper.get(i)<Intermediary){
                Intermediary = NumsKeeper.get(i);
            }

        }

        Lowest = Intermediary;
        Product = 1;
        for (int i = 0; i < NumsKeeper.size(); i++) {
            Product *= NumsKeeper.get(i);
        }
        System.out.println("The list of nums are : " + NumsKeeper);
        System.out.println("The highest num is: "+ Highest);
        System.out.println("The lowest num is: "+ Lowest);
        System.out.println("The product is : "+ Product);
        if(Product%2 == 0){
            System.out.println("The product is par");
        }else{
            System.out.println("The product is impar");
        }



    }
}
