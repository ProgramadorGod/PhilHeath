package Gigachad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Questioner{
    Scanner in = new Scanner(System.in);
    int UserType;
    public void AskQuestion(){
        System.out.println("Creating new user ...");
        System.out.println("Please give us the information about it.");
        System.out.println("Select if it's a Patient or a Doctor ( 1 / 2 )");
        while (UserType < 1 || UserType >2){
            try {
                System.out.println();
                System.out.print("User Type : ");
                UserType = in.nextInt();
                if (UserType < 1 || UserType> 2 ){
                    System.out.println("Error. Try again with a valid option.(1/2)");
                }
            }catch (Exception e){
                System.out.println("Error. Try again with a valid option.(1/2)");
                in.nextLine();
            }
        }
    }


    public void BasicInfo(){
        String Type ="", Name, Address, ID, PhoneNumber, Temporal;
        ArrayList<String> StrParameters = new ArrayList<>(Arrays.asList("Name", "Address", "ID", "PhoneNumber"));
        ArrayList<String> StrDates = new ArrayList<>();

        AskQuestion();
        if(UserType == 1){
            Type = "Patient";
        }else if(UserType == 2) {
            Type = "Doctor";
        }

        for (int i = 0; i < StrParameters.size(); i++) {
            System.out.print(Type +" "+StrParameters.get(i) + ":");
            Temporal = in.nextLine();
            StrDates.add(Temporal);
        }




    }
}
