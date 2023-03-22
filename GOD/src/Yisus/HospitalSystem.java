package Yisus;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Scanner;

public class HospitalSystem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList> UsersList = new ArrayList<>();

        ArrayList<ArrayList> PatientsList = new ArrayList<>();
        ArrayList<ArrayList> DoctorsList = new ArrayList<>();
        int fat = 0;
        int counter = 0;


        while (true){
            System.out.println();
            System.out.println("What do u want to do ?: ");
            System.out.println("1 . Add user.");
            System.out.println("2 . Generate date.");
            System.out.println("3 . Get users");
            System.out.println("4 . Exit.");
            int option = in.nextInt();
            switch (option){
                case 1:
                    int Type = 1;

                    do {
                        System.out.print("User Type 1(Patient) / 2(Doctor): ");
                        Type = in.nextInt();
                        if(Type != 1 && Type != 2){
                            System.out.println("This option it's not available. Try Again...");
                        }
                    }while (Type != 1 && Type != 2);
                    if (Type == 1){
                        Users a = new Patients();
                        UsersList.add(a.Users);
                        PatientsList.add(a.Patients);


                    }else if (Type == 2){
                        Users a = new Doctors();
                        UsersList.add(a.Users);
                        DoctorsList.add(a.Doctors);
                    }
                    break;

                case 2:
                    System.out.println("option 2 empty\n");
                    break;

                case 3:
                    if (UsersList.size() == 0 ){
                        System.out.println("There's no users yet");
                    }else {
                        System.out.println("PATIENTS:   " + PatientsList.size());
                        for (int i = 0; i < PatientsList.size() ; i++) {
                            fat = PatientsList.get(i).size();
                            if(fat != 0) {
                                for (int j = 0; j < PatientsList.get(i).size(); j++) {
                                    System.out.println(PatientsList.get(i).get(j));
                                }
                            }else{
                                System.out.println("Patients list it's empty");
                            }


                        };
                        System.out.println();
                        System.out.println("DOCTORS:   " + DoctorsList.size());
                        for (int i = 0; i < DoctorsList.size() ; i++) {
                            fat = DoctorsList.get(i).size();

                            if(fat != 0){
                                for (int j = 0; j < DoctorsList.get(i).size(); j++) {
                                    System.out.println(DoctorsList.get(i).get(j));
                                }
                            }else{
                                System.out.println("Doctors list it's empty");
                            }
                        };
                        System.out.println();
                    }
                    break;

            }



        }




    }

}
