package Yisus;

import java.util.ArrayList;

public class Doctors extends Users{
    private String Speciality;
    protected Doctors(){

    }

    @Override
    public ArrayList<String> GenerateObject() {
        System.out.println("New doctor inserted... ");
        System.out.println("Now please give us the patient data");
        System.out.print("Doctor Speciality: ");
        Speciality = in.nextLine();
        ArrayList<String> User = new ArrayList<>();
        User.add("Doctor");
        User.add(this.Name);
        User.add(this.Address);
        User.add(this.ID);
        User.add(String.valueOf(this.age));
        User.add(this.PhoneNumber);
        User.add(this.Speciality);
        System.out.println("Doctor : "+ User);
        return User;
    }
}
