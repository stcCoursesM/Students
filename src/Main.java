import Models.Group;
import Models.Student;

import java.io.*;
import java.util.Date;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        try {
            System.out.println("Creating...");
            // HashSet<Student> stset1 = new HashSet<Student>();
            Student std1 = new Student("Imyarek", "Familiyarekov", new Date(System.currentTimeMillis()), (long) 0);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            System.out.println("Serializing...");
            oos.writeObject(std1);
            oos.flush();
            baos.flush();
            oos.close();
            baos.close();
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            System.out.println("Deserializing...");
            Student std2 = (Student)ois.readObject();
            System.out.println("Student std1 name="+std1.getName());
            System.out.println("Student std2 name="+std2.getName());
        } catch (IOException ex){
            ex.printStackTrace();
        } catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }

}

