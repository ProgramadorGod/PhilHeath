package homework;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Patient extends Users{
    private String disease;
    public Patient(String name, String address, String occupation, int age, String disease){
        super(name, address,occupation,age);
        this.disease = disease;
    }




}
