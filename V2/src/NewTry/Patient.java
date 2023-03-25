package NewTry;

import java.util.Scanner;
import java.lang.reflect.*;

public class Patient extends User{
    String Disease, EmergencyContactNumber , Allergy, BPM;
    int PainLevel, FatPercent;
    boolean AlcoholConsumer, Smoker, Exercise;


    public Patient(){

        Scanner in = new Scanner(System.in);
        Patient patient = new Patient();
        Class<?> patClass = patient.getClass();
        Field[] patFields = patClass.getFields();
        for (Field patField: patFields) {
            patField.setAccessible(true);
            System.out.println(patField.getName());
        }
    }




}
