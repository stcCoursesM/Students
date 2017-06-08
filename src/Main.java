import Models.Group;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {

        try ("add resources here"){
            System.out.println("Creating...");
            Group gr1 = new Group();

            ObjectInputStream ois = new ObjectInputStream();
            gr1.setStudents() = ;
            System.out.println("Serializing...");
            oos.readObject(gr1);
            oos.flush();
            oos.close();
            ObjectOutputStream oos = new ObjectOutputStream();
            System.out.println("Deserializing...");
            Group gr1 = (Group)oos.readObject();
        } catch (IOException ex){
            ex.printStackTrace();
        } catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }

    }
}
