package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Doctor extends Users{
    private String speciality;
    private ArrayList<String> xd;
    private ArrayList<ArrayList<String>> DoctorsList;

    public Doctor(ArrayList<String> xd) {
        Scanner in = new Scanner(System.in);
        this.xd = xd;
        System.out.println("Please insert the speciality of the doctor " + xd.get(0) + " : ");
        speciality = in.nextLine();
        xd.add(speciality);

    }
    private void Container(){
        DoctorsList.add(xd);
    }

    public ArrayList<ArrayList<String>> getDoctorsList() {
        return DoctorsList;
    }
}