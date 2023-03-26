package NewTry;

import java.util.Scanner;
import java.lang.reflect.*;

public class Patient extends User{
    String Disease, EmergencyContactNumber , Allergy, BPM;
    int PainLevel, FatPercent;
    boolean Exercise, Smoke, Drink;

    public Patient() throws IllegalAccessException{

    }

    public void GetFields() throws IllegalAccessException {
        super.GetUserDates();
        Scanner in = new Scanner(System.in);
        Class<?> patClass = this.getClass();
        Field[] patFields = patClass.getDeclaredFields();
        boolean ValidInt = false;
        boolean ValidBool = false;

        for (Field patField: patFields) {
            patField.setAccessible(true);
            if(patField.getType() == String.class){
                System.out.print(patField.getName() + " : ");
                String Value = in.nextLine();
                patField.set(this, Value);
            } else if (patField.getType() == int.class) {
                ValidInt = false;
                while (!ValidInt){
                    try {
                        System.out.print(patField.getName() + " ( int value ) : ");
                        int Value = in.nextInt();
                        patField.set(this, Value);
                        ValidInt = true;
                    }catch (Exception e){
                        System.out.print("Please insert a valid int to : " + patField.getName() + ": ");
                        in.nextLine();
                    }

                }
            } else if (patField.getType() == boolean.class) {
                ValidBool = false;
                while (!ValidBool){
                    try {
                        System.out.print(patField.getName() + " ( true/false ) : ");
                        boolean Value = in.nextBoolean();
                        patField.set(this, Value);
                        ValidBool = true;
                    }catch (Exception e){
                        System.out.println("Please insert a valid boolean to " + patField.getName() + "... ");
                        in.nextLine();
                    }

                }
            }

        }

    }




}
