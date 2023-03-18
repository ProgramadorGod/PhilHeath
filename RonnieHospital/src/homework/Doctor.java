package homework;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Scanner;

public class Doctor extends Users{
    private String speciality;
    private ArrayList<String> xd;
    private ArrayList<ArrayList<String>> DoctorsList;

    private void Container(){
        System.out.println("Inserting xd :" + xd);
        System.out.println("Doctors List : " + DoctorsList);
        

    }

    public Doctor(ArrayList<String> xd) {
        Scanner in = new Scanner(System.in);
        this.xd = xd;
        this.DoctorsList = DoctorsList;

        System.out.println("Please insert the speciality of the doctor " + xd.get(0) + " : ");
        speciality = in.nextLine();
        xd.add(speciality);
        Container();

    }

    public ArrayList<ArrayList<String>> getDoctorsList() {
        return DoctorsList;
    }
}