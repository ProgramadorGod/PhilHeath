package Gigachad;
import java.lang.reflect.*;

public class Reflect {
    int Age, Type;
    String Name, Address, ID;

    public static void main(String[] args) {
        Class<?> myClass = Reflect.class;
        Field[] fields = myClass.getDeclaredFields();
        for (Field field: fields) {
            System.out.println(field.getName());

            try {
                System.out.println(field.get(new Reflect()));
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

    }


}
