package Taller;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        float[] a = new float[83];
        float total = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.print("Give the num : ");
            float num;
            Scanner in = new Scanner(System.in);
            num = in.nextFloat();
            a[i] = num;

        }

        for (int i = 0; i < a.length; i++) {
            a[i] -= 1.68;
            a[i] *= a[i];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
        for (int i = 0; i < a.length; i++) {
            total += a[i];
            System.out.println("Total : " + total);
        }
    }
}
