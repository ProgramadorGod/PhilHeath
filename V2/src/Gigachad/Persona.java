package Gigachad;

import java.lang.reflect.Field;
import java.util.Scanner;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
    private String telefono;
    private String email;
    // Agregar aquí los otros campos que quieras

    public Persona() {
    }

    // Agregar aquí los setters y getters para los campos

    public static void main(String[] args) throws IllegalAccessException {
        Persona persona = new Persona();
        Scanner scanner = new Scanner(System.in);
        Field[] fields = persona.getClass().getDeclaredFields();

        for (Field field : fields) {
            System.out.print("Ingrese el valor de " + field.getName() + ": ");
            String value = scanner.nextLine();
            if (field.getType() == int.class) {
                boolean validInt = false;
                while (!validInt) {
                    try {
                        int intValue = Integer.parseInt(value);
                        field.setAccessible(true);
                        field.setInt(persona, intValue);
                        validInt = true;
                    } catch (NumberFormatException e) {
                        System.out.print("Ingrese un valor entero válido para " + field.getName() + ": ");
                        value = scanner.nextLine();
                    }
                }
            } else {
                field.setAccessible(true);
                field.set(persona, value);
            }
        }

        System.out.println("Los valores ingresados son:");
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println(field.getName() + ": " + field.get(persona));
        }
    }
}
