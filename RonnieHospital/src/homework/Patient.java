package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Patient extends Users{
    private String disease;
    private ArrayList<String> xd;
    private ArrayList<ArrayList<String>> PatientsList;

    public Patient(ArrayList<String> xd) {
        Scanner in = new Scanner(System.in);
        this.xd = xd;
        System.out.println("Please insert the disease of the patient " + xd.get(0) + " : ");
        disease = in.nextLine();
        xd.add(disease);

    }
    private void Container(){
        PatientsList.add(xd);
    }

    public ArrayList<ArrayList<String>> getPatientsList() {
        return PatientsList;
    }
}