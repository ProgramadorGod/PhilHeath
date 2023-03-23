package Yisus;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Users {
    Scanner in = new Scanner(System.in);
    public ArrayList<ArrayList> Users = new ArrayList<>();
    public ArrayList<ArrayList> Patients = new ArrayList<>();
    public ArrayList<ArrayList> Doctors = new ArrayList<>();
    private boolean Correct = false;
    protected String Name, Address, ID, PhoneNumber;
    protected int age;

    protected void AskUserDates(){
        System.out.print("User Name: ");
        Name = in.nextLine();
        System.out.print("User Address: ");
        Address = in.nextLine();
        System.out.print("User ID: ");
        ID = in.nextLine();
        System.out.print("User Age: ");
        while (!Correct){
            try {
                age = in.nextInt();
                Correct = true;
            }catch (Exception e){
                System.out.println("ERROR, Insert a valid number. Try again ...");
                in.nextLine(); //Clean the buffer
            }
        }

        System.out.print("User PhoneNumber: ");
        PhoneNumber = in.nextLine();
        PhoneNumber = in.nextLine();

    }

    protected abstract ArrayList<String> GenerateObject();



    public Users(){
        AskUserDates();
        ArrayList<String> random = GenerateObject();
        Users.add(random);
        if(random.get(0) == "Patient"){
            Patients.add(random);
        }
        if(random.get(0) == "Doctor") {
            Doctors.add(random);
        }


    }






}
