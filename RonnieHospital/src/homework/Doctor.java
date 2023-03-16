package homework;

public class Doctor extends Users{
    private String speciality;
    public Doctor(String name, String address, String occupation, int age, String speciality){
        super(name, address,occupation,age);
        this.speciality = speciality;

    }




}
