package homework;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Scanner;

public class Central {

    private static ArrayList<ArrayList<String>> Keeper = new ArrayList<ArrayList<String>>();
    private static int loops, age,intermediary;
    private static String name,address, occupation, disease, speciality;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("===================================================================");
        System.out.println("Welcome, this is a program to add Doctors, Patients and set dates");
        System.out.println("===================================================================");
        System.out.println();
        System.out.println("\nCreating new user... ");
        System.out.print("How much users do u wanna insert ? : ");
        loops = in.nextInt();
        for (int i = 0; i < loops; i++) {
            name = in.nextLine();
            System.out.print("Insert the name of the user: ");
            name = in.nextLine();
            System.out.print("Insert the address of the user: ");
            address = in.nextLine();
            System.out.println("Choose the number of the user type: 1  (Doctor) / 2 (Patient)");
            intermediary = in.nextInt();
            if(intermediary == 1){
                occupation = "Doctor";
            } else if (intermediary == 2) {
                occupation = "Patient";
            }else{
                System.out.println("This option it's not available");
            }
            System.out.println("Insert the age of the user: ");
            age = in.nextInt();
            Users a = new Users(name,address ,occupation ,age );
            a.Execute();
            Keeper.add(a.getUserProps());

        }


        Users DefaultUser1 = new Users("Ronnie", "Street 2", "Patient", 30);
        DefaultUser1.Execute();
        Keeper.add(DefaultUser1.getUserProps());
        Users DefaultUser2 = new Users("Arnold", "Street 2", "Doctor", 30);
        DefaultUser2.Execute();
        Keeper.add(DefaultUser2.getUserProps());

        System.out.println("Users Register : " + Keeper);

        for (int i = 0; i < Keeper.size(); i++) {
            for (int j = 0; j < Keeper.get(i).size(); j++) {
                if(Keeper.get(i).get(j) == "Patient"){
                    Patient patient = new Patient(Keeper.get(i));

                }else if (Keeper.get(i).get(j) == "Doctor"){
                    Doctor doctor = new Doctor(Keeper.get(i));
                    Dating xDD = new Dating(doctor.getDoctorsList());


                }
            }
        }





    }
}
