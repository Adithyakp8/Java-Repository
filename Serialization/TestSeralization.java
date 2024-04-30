package Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSeralization {
    public static void main(String[] args) {

        String filename = "adithya.txt";
        // SerializeObject(filename);
        DeserializeObject(filename);

    }

    // Writing into file
    static void SerializeObject(String filename) {
        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("Adithya");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(filename)))) {
            oos.writeObject(emp);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void DeserializeObject(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(filename)))) {
            Object obj = ois.readObject();
            Employee emp = (Employee) obj;
            System.out.println("Id:" + emp.getId());
            System.out.println("Name:" + emp.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
