package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Patient extends Users{
    private String speciality;
    private ArrayList<String> xd;
    private ArrayList<ArrayList<String>> DoctorsList;

    public Patient(ArrayList<String> xd) {
        super();
        Scanner in = new Scanner(System.in);
        this.xd = xd;
        System.out.println("Please insert the disease of the patient " + xd.get(0) + " : ");
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