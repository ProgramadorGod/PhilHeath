package Yisus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class HospitalSystem {

    private static Object option;
    static boolean Correct = false;
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList> UsersList = new ArrayList<>();
        ArrayList<ArrayList> PatientsList = new ArrayList<>();
        ArrayList<ArrayList> DoctorsList = new ArrayList<>();
        ArrayList<ArrayList> DatesList2 = new ArrayList<>();

        int fat = 0;
        int counter = 0;



        while (true){
            System.out.println();
            System.out.println("What do u want to do ?: ");
            System.out.println("1 . Add user.");
            System.out.println("2 . Generate date.");
            System.out.println("3 . Get users");
            System.out.println("4 . Exit.");




            int option = 0;
            while (option == 0) {
                try {
                    option = in.nextInt();
                    if(option == 0){
                        System.out.println("Try again ... ");
                    }

                } catch (Exception e) {
                    System.out.println("Try again...");
                    in.nextLine();
                }
            }


            switch (option){
                case 1:
                    int Type = 0;

                    do {
                        System.out.print("User Type 1(Patient) / 2(Doctor): ");
                        while (Type == 0)
                        try {
                            Type = in.nextInt();
                            if(Type == 0){
                                System.out.println("Error inserting the type, please choose a valid option(1/2)");
                            }
                        }catch (Exception e){
                            System.out.println("Error inserting the type, please choose a valid option(1/2)");
                            in.nextLine();
                        }

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

                    System.out.println("This are the patients waiting for a date : ");
                    int PatientNum = 0;
                    int Selected = 0;
                    for (int i = 0; i < PatientsList.size() ; i++) {

                        fat = PatientsList.get(i).size();
                        if(fat != 0) {
                            for (int j = 0; j < PatientsList.get(i).size(); j++) {
                                PatientNum += 1;
                                System.out.println("Patient #"+String.valueOf(PatientNum) + " : " + PatientsList.get(i).get(j));
                            }
                        }else{
                            System.out.println("Any patient to make date.");
                            break;
                        }
                    };

                    if(PatientNum>0){
                        System.out.print("Please insert the number of the patient you're gonna program a date: ");
                        while (Selected == 0 || Selected < 0 || Selected >PatientNum){
                            try{
                                Selected = in.nextInt();
                                if(Selected <= 0 || Selected>PatientNum){
                                    System.out.println("Try again with a valid patient");

                                }

                            }catch (Exception e){
                                System.out.println("Error. Try Again...");
                                in.nextLine();
                                Selected = 0;
                            }
                        }
                        System.out.println("\nPatient #"+Selected + " chosen: " + PatientsList.get(Selected-1).get(0));

                    }else {
                        System.out.println("There's no patients to date");
                    }



                    System.out.println("\nNow choose the doctor.");
                    int DoctorNum = 0;
                    int Selected2 = 0;
                    for (int i = 0; i < DoctorsList.size() ; i++) {

                        fat = DoctorsList.get(i).size();
                        if(fat != 0) {
                            for (int j = 0; j < DoctorsList.get(i).size(); j++) {
                                DoctorNum += 1;
                                System.out.println("Doctor #"+String.valueOf(DoctorNum) + " : " + DoctorsList.get(i).get(j));
                            }
                        }else{
                            System.out.println("Any patient to make date.");
                        }
                    };
                    if(DoctorNum>0){
                        System.out.print("Please insert the number of the doctor you're gonna program a date: ");
                        while (Selected2 == 0 || Selected2 < 0 || Selected2 >DoctorNum){
                            try{
                                Selected2 = in.nextInt();
                                if(Selected2 <= 0 || Selected2 > DoctorNum){
                                    System.out.println("Try again with a valid doctor");
                                }

                            }catch (Exception e){
                                System.out.println("Error. Try Again...");
                                in.nextLine();
                                Selected = 0;
                            }
                        }
                        System.out.println("\nDoctor #"+Selected2 + " chosen: " + DoctorsList.get(Selected2-1).get(0));

                    }else{
                        System.out.println("There's no doctors to make the date");
                    }
                    if(DoctorNum > 0 && PatientNum >0){
                        ArrayList<Object> DatesList = new ArrayList<>();
                        System.out.println("Insert date time");
                        System.out.println("Example : 11:02:23 11:20");
                        String fechaString = in.nextLine();
                        fechaString = in.nextLine();

                        DatesList.add(PatientsList.get(Selected-1).get(0));
                        DatesList.add(DoctorsList.get(Selected2-1).get(0));
                        DatesList.add(fechaString);
                        DatesList2.add(DatesList);

                        System.out.print("The dates programmed are these : ");
                        for (int i = 0; i < DatesList2.size(); i++) {
                            System.out.println(DatesList2.get(i));

                        }

                    }



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


                case 4:
                    System.exit(0);
                    break;
            }
        }
    }

    private static void GetLists() {

    }


}
