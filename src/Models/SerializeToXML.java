package Models;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class SerializeToXML {


    static void studentSerializer(Student st) {
        System.out.println("<object type = " + st.getClass().getName() + ">");
        for (Field f : st.getClass().getDeclaredFields()){
            System.out.println("    <field type = " + f.getType().getName() + " id = " + f.getName()+" />");
        }
        System.out.println("</object>");

    }


    public static void main(String[] args) {


        Student st1 = new Student("name1", "surname1", new Date(), 1l);
        Student st2 = new Student("name1", "surname1", new Date(), 1l);
        Student st3 = new Student("name1", "surname1", new Date(), 1l);
        Student st4 = new Student("name1", "surname1", new Date(), 1l);
        List students = new ArrayList();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);


        studentSerializer(st1);

        XMLEncoder encoder = null;
        try {
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("./src/stu.xml")));
        } catch (FileNotFoundException fileNotFound) {
            System.out.println("ERROR: While Creating or Opening the File dvd.xml");
        }
        encoder.writeObject(students);
        encoder.close();

    }

}


